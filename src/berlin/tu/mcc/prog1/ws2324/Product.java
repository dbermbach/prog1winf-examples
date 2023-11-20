package berlin.tu.mcc.prog1.ws2324;

public class Product {
    protected String description;
    protected int price;

    public Product(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
