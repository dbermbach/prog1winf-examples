package berlin.tu.mcc.prog1.ws2223;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello Wo\nrld!");

        int i = 5;
        int j;
        j=(5+i)*(8-5);
        i=j/20;
        j=j%20;
        //System.out.println("i = "+i);
        System.out.println("j = "+j + " und das ist total toll oO");
        String s = "i = "+i;
        System.out.println(s);
        System.out.println(10.0/4);
        System.out.println(i/j + " vs. nicht-ganzzahlig: "+ (i/(double)j));
    }

}
