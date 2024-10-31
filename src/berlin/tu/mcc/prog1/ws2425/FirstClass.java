package berlin.tu.mcc.prog1.ws2425;


import Prog1Tools.IOTools;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("hello world");
        /*System.out.print(12345);*/
        System.out.print(23456); // test
        // das ist ein kommentar
        /* das hier auch
        und geht bis hier
         */
        int i;
        i = 42;
        //byte,short,int,long=> ganzzahlen
        //float, double => gleitkommazahlen
        //boolean
        //char
        //String => eigentlich kein primitiver Datentyp
        boolean b = true;//false
        double d = 1.23e14;//1.23 .23 1235467  12345.2346783568374 -0.00000012345
        float f = 1.23f;
        long l = 123l;
        String s = "hello\n\t     \\";
        char c = 'a';
        String s2 = null;
        s2 = s;
        b = false;
        c = '\n';
        System.out.println(b);
        int i2 = 2;
        long l2 = i2;
        i2 = (int) l2;
        int eingelesen = IOTools.readInt();
        System.out.println(eingelesen);
        System.out.println(IOTools.readLine("bitte ein string:"));
        // 2. vorlesung
        i2 = i2 + i2; // +-*/%
        i2 = (i2 * 3) + 12;
        i2 = 2 / 3; // ergebnis 0
        i2 = 2 % 3; // ergebnis 2
        d = 2.0 / 3.0; // ergebnis 0.6666...
        d = 2 / 3.0;
        d = (double) 2 / 3;
        d = (double) (2 / 3);
        d = (1.0 * 2) / 3;

        i = 0;
        i++;
        ++i;
        i--;
        --i;
        i2 = i++;  // i2 ist 0, i ist 1
        i = 0;
        i2 = ++i; // i2 und i sind 1
        int i3, i4 = 13, i5 = 42;
        i = i2 = i3 = i4 = i5;
        boolean comp;
        comp = i < i2; // > <= >= == !=
        b = b && comp; // b&comp
        b = b || comp; // b|comp
        b = !comp;
        b = (b && b || (!b && b) || b) & b && i < i2;
        i = i + 3;
        i += 3;// *= /= -= ...
        d = Math.sqrt(Math.PI * 42 * Math.random());
        String helloWorld = "hello " + "world" + d + d;

        if (i < i2) {
            System.out.println("i<i2");
        } else {
            System.out.println("i>=i2");
        }

        if (i < i2) {
            System.out.println("<");
        } else if (i > i2) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }

        switch (i) {
            case 0:
            case -1:
            case -42:
            case 1:
                System.out.println(1);
                System.out.println("i ist doof");
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("was Anderes");
        }

        //arrays
        int[] arr;//deklarieren
        arr = new int[3]; //initialisieren
        arr[0] = 42;
        arr[1] = 44;
        arr[2] = 1;
        System.out.println(arr[2]);
        //tiefe kopie
        int[] arr2 = new int[arr.length];
        arr2[0] = arr[0];
        arr2[1] = arr[1];
        arr2[2] = arr[2];
        arr = new int[]{2, 233, 32345, 45, 51};
        //2d array
        int[][] array2d = new int[2][3];
        array2d[0] = new int[42];

        for (int j = 0; j < 42; j++) {
            System.out.println("iteration " + j + ": Hello world!");
        }
        //tiefe kopie mit schleife
        int[] langesArray = {1, 2, 3, 4, 5, 6, 76, 7, 98};
        int[] target = new int[langesArray.length];
        for (int j = 0; j < langesArray.length; j++) {
            target[j] = langesArray[j];
        }
        //rueckwaerts
        for (int j = target.length - 1; j >= 0; j--) {
            System.out.println(target[j]);
        }
        //vorwaerts
        for (int j = 0; j < target.length; j++) {
            System.out.println(target[j]);
        }
        //und als for each
        for (int value : target) {
            System.out.println(value);
        }

        //solange bedingung erfüllt ist, tue folgendes
        double rand;
        while (/*bedingung*/ (rand = Math.random()) > 0.2) {
            //statements
            System.out.println(rand);
        }
        //tue folgendes, solange bedingung erfüllt
        do {
            //statements
            System.out.println(rand);
        } while ((rand = Math.random()) > 0.2);


    }

}
