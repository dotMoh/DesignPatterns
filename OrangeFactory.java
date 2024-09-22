//creates new orange based on groceryproductfactory interface
public class OrangeFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct makeProduct() {
        return new Orange();
    }
}