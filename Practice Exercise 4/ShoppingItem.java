public class ShoppingItem {
    private int id;
    private String itemName;
    private double price;
    private int stock = 0;

    public ShoppingItem(int id, String itemName, double price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    public double applyDeduction(double percentage) {
        double deduction = price - (price * percentage);
        return deduction;
    }

    public String toString() {
        String string = itemName + "(" + id + "): costs " + price + " and has " + stock + "stock.";
        return string;
    }
    
    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
}
