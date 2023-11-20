package berlin.tu.mcc.prog1.ws2324;

public class PremiumUser extends User {

    protected PremiumUser(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void sendtext(String message) {
        System.out.println("Liebe/r " + getUsername() + ", " + message);
    }
}
