package berlin.tu.mcc.prog1.ws2324;

public class Order {

    private User user;
    private Product[] products;

    public Order(User user, Product... products) {
        this.user = user;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public Product[] getProducts() {
        return products;
    }
}
