package berlin.tu.mcc.prog1.ws2526;

public class ChessFieldOps {

    public static void main(String[] args) {
        // add to first array dimension to go down, add to second dimension to go right
        char startLR = 'D', startUD = '5';
        int[][] chessField = buildChessField();
        markStart(startLR, startUD, chessField);
        printChessField(chessField);
         markPositionsReachableForPawn(startLR,startUD, chessField, 2, false);
        //markPositionsReachableForKnight(startLR,startUD, chessField, 1);
        markStart(startLR, startUD, chessField);
        System.out.println("result:");
        printChessField(chessField);

    }

    public static void markStart(char startLR, char startUD, int[][] chessField) {
        if (isOnField(startLR, startUD, chessField)) chessField[toUDInt(startUD)][toLRInt(startLR)] = -1;
    }

    public static void markPositionsReachableForKnight(char startLR, char startUD, int[][] chessField, int noOfSteps) {
        //pawns can go one step in Up/Down direction, Left/Right stays constant
        if (noOfSteps <= 0) {
          //  System.out.println("no more steps");
            return;
        }
        int lr = toLRInt(startLR), ud = toUDInt(startUD);

        //first N, then E
        int udNE = ud - 2, lrNE = lr + 1;
        if (isOnField(udNE, lrNE, chessField)) {
            chessField[udNE][lrNE] = 1;
            System.out.println("going NE from " + toCoordinateString(lr, ud) + ": marking " + toCoordinateString(lrNE, udNE));
            markPositionsReachableForKnight(toLRChar(lrNE), toUDChar(udNE), chessField, noOfSteps - 1);
        }

        //first N, then W
        int udNW = ud - 2, lrNW = lr - 1;
        if (isOnField(udNW, lrNW, chessField)) {
            chessField[udNW][lrNW] = 1;
            System.out.println("going NW from " + toCoordinateString(lr, ud) + ": marking " + toCoordinateString(lrNW, udNW));
            markPositionsReachableForKnight(toLRChar(lrNW), toUDChar(udNW), chessField, noOfSteps - 1);
        }

        //first S, then E
        int udSE = ud + 2, lrSE = lr + 1;
        if (isOnField(udSE, lrSE, chessField)) {
            chessField[udSE][lrSE] = 1;
            System.out.println("going SE from " + toCoordinateString(lr, ud) + ": marking " + toCoordinateString(lrSE, udSE));
            markPositionsReachableForKnight(toLRChar(lrSE), toUDChar(udSE), chessField, noOfSteps - 1);
        }
        //first S, then W
        int udSW = ud + 2, lrSW = lr - 1;
        if (isOnField(udSW, lrSW, chessField)) {
            chessField[udSW][lrSW] = 1;
            System.out.println("going SW from " + toCoordinateString(lr, ud) + ": marking " + toCoordinateString(lrSW, udSW));
            markPositionsReachableForKnight(toLRChar(lrSW), toUDChar(udSW), chessField, noOfSteps - 1);
        }
        //first E, then N
        int udEN = ud - 1, lrEN = lr + 2;
        if (isOnField(udEN, lrEN, chessField)) {
            chessField[udEN][lrEN] = 1;
            System.out.println("going EN from " + toCoordinateString(lr, ud) + ": marking " + toCoordinateString(lrEN, udEN));
            markPositionsReachableForKnight(toLRChar(lrEN), toUDChar(udEN), chessField, noOfSteps - 1);
        }
        //first E, then S
        int udES = ud + 1, lrES = lr + 2;
        if (isOnField(udES, lrES, chessField)) {
            chessField[udES][lrES] = 1;
            System.out.println("going ES from " + toCoordinateString(lr, ud) + ": marking " + toCoordinateString(lrES, udES));
            markPositionsReachableForKnight(toLRChar(lrES), toUDChar(udES), chessField, noOfSteps - 1);
        }
        //first W, then N
        int udWN = ud - 1, lrWN = lr - 2;
        if (isOnField(udWN, lrWN, chessField)) {
            chessField[udWN][lrWN] = 1;
            System.out.println("going WN from " + toCoordinateString(lr, ud) + ": marking " + toCoordinateString(lrWN, udWN));
            markPositionsReachableForKnight(toLRChar(lrWN), toUDChar(udWN), chessField, noOfSteps - 1);
        }
        //first W, then S
        int udWS = ud + 1, lrWS = lr - 2;
        if (isOnField(udWS, lrWS, chessField)) {
            chessField[udWS][lrWS] = 1;
            System.out.println("going WS from " + toCoordinateString(lr, ud) + ": marking " + toCoordinateString(lrWS, udWS));
            markPositionsReachableForKnight(toLRChar(lrWS), toUDChar(udWS), chessField, noOfSteps - 1);

        }


    }

    public static boolean isOnField(int lrArrayIndex, int udArrayIndex, int[][] chessField) {
        if (lrArrayIndex >= chessField.length || lrArrayIndex < 0 || udArrayIndex >= chessField[0].length || udArrayIndex < 0) {
            return false;
        }
        return true;
    }

    public static boolean isOnField(char lr, char ud, int[][] chessField) {
        return isOnField(toLRInt(lr), toUDInt(ud), chessField);
    }


    public static void markPositionsReachableForPawn(char startLR, char startUD, int[][] chessField, int noOfSteps, boolean goingDown) {
        //pawns can go one step in Up/Down direction, Left/Right stays constant
        if (noOfSteps <= 0) {
         //   System.out.println("no more steps");
            return;
        }
        int nextLR = toLRInt(startLR), nextUD = toUDInt(startUD);
        if (goingDown) nextUD++;
        else nextUD--;

        if (!isOnField(nextLR, nextUD, chessField)) {
            System.out.println(toCoordinateString(nextLR, nextUD) + " is outside the field");
            return;
        }
        System.out.println("marking " + toCoordinateString(nextLR, nextUD));
        chessField[nextUD][nextLR] = 1;
        markPositionsReachableForPawn(toLRChar(nextLR), toUDChar(nextUD), chessField, noOfSteps - 1, goingDown);

    }

    public static void printChessField(int[][] chessField) {
        System.out.print("  ");
        for (int i = 0; i < chessField[0].length; i++) {
            System.out.print(toLRChar(i) + " ");
        }
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < chessField[0].length; i++) {
            System.out.print("- ");
        }
        System.out.println();
        for (int i = 0; i < chessField.length; i++) {
            System.out.print(toUDChar(i) + "|");
            for (int j = 0; j < chessField[i].length; j++) {
                if (chessField[i][j] != -1) System.out.print(chessField[i][j] + " ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static int[][] buildChessField() {
        int[][] res = new int[8][8];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[j][i] = 0;
            }
        }

        return res;
    }

    public static String toCoordinateString(int lr, int ud) {
        return "(" + toLRChar(lr) + "|" + toUDChar(ud) + ")";
    }

    /**
     * assumes that chars are in the correct range
     *
     * @param lr
     * @return
     */
    public static int toLRInt(char lr) {
        return lr - 65;
    }

    public static char toLRChar(int i) {
        return (char) (i + 65);
    }

    public static char toUDChar(int i) {
        return (char) (i + 49);
    }

    public static int toUDInt(char c) {
        return c - 49;
    }

}
