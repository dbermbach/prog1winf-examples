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


    }

}
