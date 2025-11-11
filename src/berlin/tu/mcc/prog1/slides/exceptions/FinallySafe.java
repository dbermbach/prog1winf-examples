package berlin.tu.mcc.prog1.slides.exceptions;

public class FinallySafe {

    public static void main(String[] args) {
        handleExceptions();
    }

    public static void handleExceptions() {
        try {
            Exceptional.imDevastated();
            System.out.println("This statement is never reached.");
        } catch (Exception e) {
            System.out.println("Gotcha, exception!");
        } finally{
            System.out.println("Finally, cleaned up this mess.");
        }
        System.out.println("It didn't crash, heureka!");
    }
}
