package berlin.tu.mcc.prog1.ws2324;

import Prog1Tools.IOTools;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("hello world!");
        String name;
        name = "Jane Doe";
        String name2 = "John Doe";
        /*System.out.println(name);
        System.out.print("Hello ");
        System.out.println(name2);*/
        name2 = "Hello " + name;
        System.out.println(name2 + " and all the others");
        // comment
        long i = 42;
        int j = (int) i;
        System.out.println(i+(3*8/12)-515*i);
        i = i*43;
        i*=43;
        long meineLieblingsLongVariable = 31;
        System.out.println("1 durch 2 = "+ ((double)1/2));
        System.out.println("1 durch 2 = "+ (1/2));
        System.out.println("1 durch 2 = "+ (1/2.0));
        System.out.println("1 mod 2 = " + (1%2));
        double d = Math.sqrt(49);
        boolean b = meineLieblingsLongVariable<i;// > <= >= == !=
        boolean b2 = false;
        b2 = b == b2;
        b2 = !b; // not
        b2 = b && b2; // and
        b2 = b || b2; // or

        int c = (int) (i = 0);
        c++;
        ++c;
        c--;
        --c;
        i = 0;
        i = c++; // äquivalent zu: i=c;c=c+1;
        System.out.println("i="+i +"c="+c);
        i = 0; c =0;
        i = ++c; // äquivalent zu; c=c+1;i=c;
        System.out.println("i="+i+"c="+c);
        meineLieblingsLongVariable++;

        i = IOTools.readInt();
        System.out.println(i++);
        i = IOTools.readInt("bitte Zahl eingeben: ");
        System.out.println("Echo: "+i);

        






    }
}
