package berlin.tu.mcc.prog1.ws2324;

public class User {

    private String username = "";
    private String email = "";
    private String password;
    private int discount ;
    private static int sale = 10;


    protected User(String username, String email, String password) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public static User createUserFrom(String username, String email, String password) {
        if (username != null && email != null && password != null && email.contains("@")) {
            return new User(username, email, password);
        }
        return null;
    }

    public boolean authenticate(String pw) {
        return this.password.equals(pw);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null) {
            this.username = username;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Das hat nicht geklappt");
        }
    }

    public void setPassword(String oldPw, String password) {
        if (oldPw != null && password != null && authenticate(oldPw)) {
            this.password = password;
        }
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public static int getSale() {
        return sale;
    }

    public static void setSale(int sale) {
        User.sale = sale;
    }

    public void sendtext(String message) {
        System.out.println("Hallo " + username + ", " + message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getEmail().equals(user.getEmail())) return false;
        return password.equals(user.password);
    }

    @Override
    public int hashCode() {
        int result = getEmail().hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
