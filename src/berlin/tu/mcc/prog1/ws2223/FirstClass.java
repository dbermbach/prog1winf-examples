package berlin.tu.mcc.prog1.ws2223;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello Wo\nrld!");

        int i = 5;
        int j;
        j = (5 + i) * (8 - 5);
        i = j / 20;
        j = j % 20;
        //System.out.println("i = "+i);
        System.out.println("j = " + j + " und das ist total toll oO");
        String s = "i = " + i;
        System.out.println(s);
        System.out.println(10.0 / 4);
        System.out.println(i / j + " vs. nicht-ganzzahlig: " + (i / (double) j));

        i = 1;
        j = 1;
        int a = i++;
        int b = ++j;
        System.out.println("a=" + a + ", b=" + b);
        --i;
        i--;
        System.out.println(i == a);
        /*
        ungleich 3!=a
        groesser i>a
        kleiner i<i (Ergebnis ist immer false)
        groesser gleich i>=j
        kleiner gleich j<=a
        !true

        boolean1  boolean2
        boolean1 | boolean2
         */


    }




}
