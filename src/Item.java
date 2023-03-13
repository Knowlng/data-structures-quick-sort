public class Item {
    private int id;
    private String name;
    private double price;
    private int amountIn;
    private double totalPriceIn;
    private int amountOut;
    private double totalPriceOut;
    private int amountLeft;

    public Item() {}

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountIn() {
        return this.amountIn;
    }

    public void setAmountIn(int amountIn) {
        this.amountIn = amountIn;
    }

    public double getTotalPriceIn() {
        return this.totalPriceIn;
    }

    public void setTotalPriceIn(double totalPriceIn) {
        this.totalPriceIn = totalPriceIn;
    }

    public int getAmountOut() {
        return this.amountOut;
    }

    public void setAmountOut(int amountOut) {
        this.amountOut = amountOut;
    }

    public double getTotalPriceOut() {
        return this.totalPriceOut;
    }

    public void setTotalPriceOut(double totalPriceOut) {
        this.totalPriceOut = totalPriceOut;
    }

    public int getAmountLeft() {
        return this.amountLeft;
    }

    public void setAmountLeft(int amountLeft) {
        this.amountLeft = amountLeft;
    }

    @Override
    public String toString() {
        return "itemId=" + getId() + ", "
                + "itemName=" + getName() + ", "
                + "amountIn=" + getAmountIn() + ", "
                + "totalPriceIn=" + getTotalPriceIn() + ", "
                + "amountOut=" + getAmountOut() + ", "
                + "totalPriceOut=" + getTotalPriceOut() + ", "
                + "amountLeft=" + getAmountLeft();

    }
}
