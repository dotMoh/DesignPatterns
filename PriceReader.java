// file reader for prices.txt
import java.io.*;
import java.util.*;

public class PriceReader {
    public static Map<String, Double> readPrices(String filePath) throws IOException {
        File file = new File(filePath); // check if the file exists and is readable
        if (!file.exists())
            throw new FileNotFoundException("File " + filePath + " not found");
        Map<String, Double> prices = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            prices.put(parts[0], Double.parseDouble(parts[1]));
        }
        reader.close();
        return prices;
    }
}
