// main driver program, calls methods for grocery item production, file reads from file for prices
// and displays final grocery items with their respective prices
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, Double> prices = PriceReader.readPrices("src/prices.txt");// read from the database (file with information)
            GroceryProductFactory appleFactory = new AppleFactory();
            GroceryProductFactory orangeFactory = new OrangeFactory(); //create two new factories to create make construction possible
            GroceryProduct Apple = appleFactory.makeProduct();
            Apple.setPrice(prices.get("Apple")); //create apple and set its price
            GroceryProduct Orange = orangeFactory.makeProduct();
            Orange.setPrice(prices.get("Orange")); //create orange and set its price.
            System.out.printf("Price of Apple: $%.2f%n", Apple.getPrice());
            System.out.printf("Price of Orange: $%.2f%n", Orange.getPrice());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}