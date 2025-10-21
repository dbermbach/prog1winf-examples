package berlin.tu.mcc.prog1.ws2526;

import Prog1Tools.IOTools;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.print("foo");
        System.out.print("foo");
        // einzeiliger Kommentar
        /*
        mehrzeiliger Kommentar
         */
        int i;
        i=5;
        int j = 6;
        //byte, short, int, long => Ganzzahlen
        // float, double => Gleitkommazahlen
        // boolean
        // char
        // String
        String nameOfEmployee = "Jane Doe\n\t\"\\";
        char c = 'a';
        i = 0x42af; // hexadezimal
        i = 0b1011; // binär
        i = 123_456_789;
        long l = 123l;
        double d = 1.23; // .23 123e-56 => entspricht 123 mal zehn hoch minus 56
        boolean b = true; // oder false
        String s = null;
        System.out.println(nameOfEmployee);
        b = IOTools.readBoolean("bitte boolean eingeben");
        System.out.println(b);
    }
}
