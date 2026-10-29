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
        result = !b1;
        result = !result && (b1 || b2 & result) & !b1 && (1 + 2 + 3 + 4 + 5 + 5 + 2 + 32 + 34 > 11) || false;

        b1 = b2 = b3 = !(b4 = true);

        intVariable = intVariable + 7;
        intVariable += 7;

        System.out.println("dritte wurzel aus 42 = " + Math.cbrt(42));
        

    }


}
