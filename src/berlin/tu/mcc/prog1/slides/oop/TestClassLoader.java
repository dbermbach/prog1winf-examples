package berlin.tu.mcc.prog1.slides.oop;

public class TestClassLoader {
    static Helper helper1 = new Helper("helper1");

    static {
        System.out.println("static block");
    }

    static Helper helper2 = new Helper("helper2");

    public static void main(String[] args) {
        System.out.println("main");
    }

}


class Helper {
    Helper(String s) {
        System.out.println(s);
    }
}