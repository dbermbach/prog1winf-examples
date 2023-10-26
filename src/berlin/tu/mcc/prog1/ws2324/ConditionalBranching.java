package berlin.tu.mcc.prog1.ws2324;

public class ConditionalBranching {

    public static void main(String[] args) {
        int i = 42 * 42;
        if (i > 100) {
            System.out.println("was true");
            if (i > 200) {
                System.out.println("was also greater than 200");
            } else if (i == 200) {
                System.out.println("was exactly 200");
            } else {
                System.out.println("but was less than 200");
            }
        } else {
            System.out.println("was false");
        }

        i = 200;
        if (i > 200) {
            System.out.println("was also greater than 200");
        } else if (i == 200) {
            System.out.println("was exactly 200");
        } else {
            System.out.println("but was less than 200");
        }

        //switch case
        i = 0;
        switch (i){
            case 0:
                System.out.println("was zero");
                break;
            case 1:
                System.out.println("was one"); break;
            case 42:
                System.out.println("was 42"); break;
            default:
                System.out.println("was something else: " +i);

        }

        

    }
}
