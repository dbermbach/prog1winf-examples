package berlin.tu.mcc.prog1.ws2627;

public class FirstClass {

    /**
     * Javadoc Kommentar
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
        String meineZeichenkette = "hello world 123 \n \t hello";

    }


}
