//creates new apple based on groceryproductfactory interface
public class AppleFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct makeProduct() {
        return new Apple();
    }
}