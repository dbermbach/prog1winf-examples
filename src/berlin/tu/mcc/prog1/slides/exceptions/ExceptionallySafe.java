package berlin.tu.mcc.prog1.slides.exceptions;

public class ExceptionallySafe {

    public static void main(String[] args) {
        handleExceptions();
    }

    public static void handleExceptions() {
        try {
            Exceptional.imDevastated();
            System.out.println("This statement is never reached.");
        } catch (Exception e) {
            System.out.println("I got your back, you're safe now. "
                    + "But stop calling methods on null references.");
        }
        System.out.println("It didn't crash, heureka!");
    }
}
