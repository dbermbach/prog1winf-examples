package berlin.tu.mcc.prog1.slides.oop;

public class TestClassLoader2 extends SuperClass {
    static Helper helper1 = new Helper("helper");

    static {
        System.out.println("static");
    }

       public static void main(String[] args) {
        System.out.println("main");
        Child c = new Child();
    }

}

class SuperClass {
    static {
        System.out.println("super static");
    }

    static Helper superHelper = new Helper("super");
}

class Child extends SuperClass {
    static Helper childHelper = new Helper("child");
}


