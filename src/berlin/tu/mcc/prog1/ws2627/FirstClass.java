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

        boolean result = intVariable>0; // >= < <= == !=

    }


}
