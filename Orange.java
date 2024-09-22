//this class takes methods from GroceryProduct in order to setPrice on orange
public class Orange extends GroceryProduct {
    @Override
    public void setPrice(double price) {
        this.price = price;
        System.out.printf("Orange price read from file $%.2f%n", this.price);
    }
}
