package berlin.tu.mcc.prog1.ws2324;

public class Clothing extends Product{

    private String color;

    public Clothing(String description, int price) {
        super(description, price);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }
}
