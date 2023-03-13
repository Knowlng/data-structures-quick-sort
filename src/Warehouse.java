public class Warehouse {
    private String date;
    private int itemId;
    private int amount;
    private int in_out;
    private String itemName;

    public Warehouse() {}

    public Warehouse(String date, int itemId, int amount, int in_out) {
        this.date = date;
        this.itemId = itemId;
        this.amount = amount;
        this.in_out = in_out;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getIn_out() {
        return this.in_out;
    }

    public void setIn_out(int in_out) {
        this.in_out = in_out;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "[" +
                getDate() + ", " +
                getItemId() + ", " +
                getItemName() + ", " +
                getAmount() + ", " +
                getIn_out()
                + "]";
    }
}