package berlin.tu.mcc.prog1.ws2324;

public class Shirt extends Clothing{
    private String size;

    public Shirt(String description, int price) {
        super(description, price);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size != null) {
            this.size = size;
        }
    }
}
