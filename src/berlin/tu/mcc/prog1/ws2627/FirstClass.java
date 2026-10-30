package berlin.tu.mcc.prog1.ws2627;

import Prog1Tools.IOTools;

public class FirstClass {

    /**
     * Javadoc Kommentar
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Hello world!");
        System.out.println("hey");
        System.out.println(42); // hier auch
        // einzeiliger Kommentar 
        /* foobar
         *
         * mehrzeiliger KOmmentar
         *
         *  */
        int intVariable = 42;
        intVariable = 39_123_123;
        System.out.println(intVariable);
        //byte, short, int,
        long erdumfangInPicometer = 123L;
        // float
        double meineDoubleVariable = -1.23e-14; // 1.23 oder 0.23 oder .1
        boolean meinBoolean = true; // oder false
        char einZeichen = 'a'; // \n \t \\
        String meineZeichenkette = "hello world 123 \n \t hello"; //null
        meineZeichenkette = null;

        intVariable = IOTools.readInt("tippe ein int");
        //ist das gleiche wie
        System.out.print("tippe ein int");
        intVariable = IOTools.readInt();
        System.out.print("echo:");
        System.out.println(intVariable);
        long l = intVariable;
        intVariable = (int) l;
        System.out.println(l);
        System.out.println((byte) l);
        l = 3 + (5 - 42) + (l - intVariable * 23) / 12;
        intVariable = 2;
        System.out.println(intVariable / 3L);
        double d = 2;
        System.out.println(d / 3);
        System.out.println(7 % 4); //ergibt 3

        int help, help2;
        intVariable = 0;
        help = intVariable++;
        // intVariable ist auf jeden Fall jetzt 1
        intVariable = 0;
        help2 = ++intVariable;
        // intVariable ist auf jeden Fall jetzt 1
        intVariable--;
        --intVariable;

        boolean result = intVariable > 0; // >= < <= == !=

        System.out.println("5" + (2 + 2)); //ergibt "54"
        System.out.println(2 + 2 + "2"); // ergibt "42"
        String s = 2 + 2 + 2 + "2";

        boolean b1 = true, b2 = true, b3, b4;
        result = b1 && (intVariable++ > 32); // and
        result = b1 || b2; //or
        result = !b1; //not
        result = !result && (b1 || b2 & result) & !b1 && (1 + 2 + 3 + 4 + 5 + 5 + 2 + 32 + 34 > 11) || false;

        b1 = b2 = b3 = !(b4 = true);

        intVariable = intVariable + 7;
        intVariable += 7;

        System.out.println("dritte wurzel aus 42 = " + Math.cbrt(42));


        if (b1) {
            //true case mit beliebig vielen Statements
            System.out.println("Bedingung war true");
        } else {
            //in allen anderen Fällen
            System.out.println("Expression im if war false");
        }

        if (b1)
            System.out.println("Bedingung war true (aber nur ein Stmnt)");
        else
            System.out.println("Expression im if war false (auch hier nur ein Stmnt)");

        if (b2)
            System.out.println("haha");
        System.out.println("nicht im if!");

        if (b1) {
            //do sth.
            // b1 ist true
        } else if (b2) {
            // b1 ist false, aber b2 ist true
            //do sth
        } else if (intVariable > 5) {
            // b1 ist false, b2 ist false und intVariable ist größer 5
        } else {
            //b1 ist false, b2 ist false und intVariable ist kleiner gleich 5
        }

        int i = 0;
        if (i == 0) {

        } else if (i == 1) {

        } else if (i == 2) {

        } else if (i == 3) {

        } else {

        }

        int j = 0;
        switch (j) {
            case -1:
            case -2:
            case 0:
                System.out.println("j war 0, -1 oder -2");
                break;//do sth
            case 1:
                System.out.println("j war 1");
                break;//do sth
            case 5:
                System.out.println("j war 5");
                break;//do sth
            default:
                System.out.println("default block");

        }
        String string = "hello";
        switch (string) {
            case "hello":
                System.out.println("hello");
                break;
            default:
                System.out.println("not hello");
        }


        int[] arr = new int[4];
        int jj = 3;
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 1;
        System.out.println("array an stelle 2="+arr[2]);
        int jj2 = jj;
        jj = 5;
        System.out.println(jj2);
        int[] arr2 = arr;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        arr[0] = 5;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);



    }


}
