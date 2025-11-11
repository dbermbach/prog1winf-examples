package berlin.tu.mcc.prog1.slides.exceptions;

public class Exceptional {

    public static void main(String[] args) {
        imDevastated();
    }

    static void imDevastated() {
        howCouldThisHappen();
    }

    static void howCouldThisHappen() {
        ohNoSomethingWentWrong();
    }

    static void ohNoSomethingWentWrong() {
        Exception e = null;
        e.printStackTrace();
    }
}
