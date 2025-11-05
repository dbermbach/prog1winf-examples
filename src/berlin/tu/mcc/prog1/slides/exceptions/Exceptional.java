package berlin.tu.mcc.prog1.slides.exceptions;

public class Exceptional {

    public static void main(String[] args) {
        imDevastated();
    }

    static void howCouldThisHappen() {
        ohNoSomethingWentWrong();
    }

    static void imDevastated() {
        howCouldThisHappen();
    }

    static void ohNoSomethingWentWrong() {
        Exception e = null;
        e.printStackTrace();

    }

}
