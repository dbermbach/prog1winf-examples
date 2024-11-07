package berlin.tu.mcc.prog1.ws2425;

public class SecondClass {

    public static void main(String[] args) {
        System.out.println(add(3, 4));
        int something = add(add(3, 4), add(3 * 18 / 12, 4));
        printNumber(123);
        addNumbers(1);
        addNumbers(1,2,3,4,5,6,7,8,1,add(1,2));
        addNumbers(new int[]{1,2,3});
        addNumbers();
    }

    public static int add(int a, int b) {
        return a + b;
    }
    // double double
    // int long
    // long int
    // int int


    public static int add(int a, int b, int c){
        return addNumbers(a,b,c);
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static int addNumbers(int...a) {
        int res = 0;
        for (int i : a) res += i;
        return res;
    }

    public static void printNumber(int a) {
        if (a == 42) return;
        System.out.println("I love " + a);
    }

}
