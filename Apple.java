//this class takes methods from GroceryProduct in order to setPrice on apple
public class Apple extends GroceryProduct {
    @Override
    public void setPrice(double price) {
        this.price = price;
        System.out.printf("Apple price read from file $%.2f%n", this.price);
    }
}
