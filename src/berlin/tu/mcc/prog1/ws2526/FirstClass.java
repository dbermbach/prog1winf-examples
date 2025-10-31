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
        i = 5;
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
        long meinLong = i;
        i = (int) meinLong;
        System.out.println("d=" + d);
        System.out.println("d als int=" + ((int) d));

        meinLong = i + 5; // - * / %
        System.out.println(3 / 5);
        System.out.println(3.0 / 5.0);
        meinLong = i * i + (1 + 34) * i - i + 12;
        System.out.println(123 + 43);
        System.out.println("als string:" + 123 + 43);
        System.out.println("als string:" + (123 / 43));
        int m, n = 4, k = 1;
        int nameDerErstenVariable = 0, nameDerZweitenVariable = 1;
        nameDerErstenVariable = nameDerErstenVariable + nameDerZweitenVariable;
        nameDerErstenVariable += nameDerZweitenVariable; //macht das gleiche
        i = 1;
        m = i++;
        m = ++i;
        m = i--;
        m = --i;

        boolean b2 = i == m; // < > <= >= !=

        b = b2 && b; // || !
        b = b2 || b;
        b = !(b2 && b);

        m = i = 1;

        double dRand = Math.ceil(Math.random());
        //Google: java api klassenname

        if (dRand == 0) {
            System.out.println("oh, it was zero!1!111!");
        } else {
            System.out.println("as expected it was 1 :-)");
        }

        if (nameDerZweitenVariable == 0)
            System.out.println("oh, it was zero!1!111!");
        else
            System.out.println("as expected it was 1 :-)");

        if (b) {
            int jjj=42+i;
            if (b2) {
                System.out.println("b und b2 sind true");
                System.out.println(jjj);
            } else {
                System.out.println("b ist true, b2 nicht");
            }
        }
        int jjj = 43;
        if (b) {
            //do sth
        } else if (b2) {
            //do sth else
        } else if (Math.random() < 0.5) {
            //do sth. else again
        } else {
            System.out.println("b was false, b2 was false, rnd nmbr was >= 0.5");
        }

        //switch case
        switch (i){
            case -2:
            case -1:
                System.out.println("was -1 or -2");
                break;
            case 0:
                System.out.println("0");
                System.out.println("immer noch 0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 42:
                System.out.println("42"); break;

            case 185:
                System.out.println("185");break;
            default:
                System.out.println("i was " +i);
        }


        int [] arr; // leere Kiste hier
        arr = new int [3]; //jetzt Storagebox angemietet
        arr[0] = 42; // Indizes von 0 bis 2
        arr[1] = 43;
        arr[2] = 45;
        int [] arr2 = new int [84838];
        arr2 = arr;
        arr2[0] = 1;
        System.out.println(arr[0]);

        //tiefe Kopie
        int [] deepcopy = new int[arr.length];
        deepcopy[0] = arr[0];
        deepcopy[1] = arr[1];
        deepcopy[2] = arr[2];
        //System.out.println(arr[-34]);

        int [][] arr2d = new int[2][3];
        arr2d[0][0] = 42;
        System.out.println(arr2d.length);
        System.out.println(arr2d[1].length);
        arr2d[0] = new int[4];

        arr = new int[]{1, 2, 3, 4, 5};
        int[] arr3 = {1,2,3};
        System.out.println(arr[0]);
        int [][] arr2dInOneLine = {{1,2,3}, {42,43,46},{1,2,3,4,5}};

        deepcopy = new int[arr.length];
        for (int ii=0;ii<arr.length;ii++){
            deepcopy[ii] = arr[ii];
        }
        



    }
}
