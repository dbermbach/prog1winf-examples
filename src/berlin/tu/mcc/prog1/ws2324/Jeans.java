package berlin.tu.mcc.prog1.ws2324;

public class Jeans extends Clothing{
    private int length;
    private String fit;

    public Jeans(String description, int price, int length) {
        super(description, price);
        this.length = length;
    }

    public Jeans(String description) {
        super(description, 2300);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        if (fit != null) {
            this.fit = fit;
        }
    }

    @Override
    public void setColor(String color) {
        if ("blue".equals(color) || "black".equals(color)) {
            super.setColor(color);
        }
    }
}
