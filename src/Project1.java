import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Project1 {
    public static void main(String [] args) throws IOException {
        var fileName = "products.txt";
        var product = Paths.get(fileName);
        var productName =  new ArrayList<String>();
        var productPrice = new ArrayList<Float>();
        var productAmount = new ArrayList<Integer>();
        var productLines = Files.readAllLines(product);
        for (var line : productLines){
            var splitLine = line.split(",");
            productName.add(splitLine[0]);
            var productP = Float.parseFloat(splitLine[1]);
            productPrice.add(productP);
            var productA = Integer.parseInt(splitLine[2]);
            productAmount.add(productA);
        }
        for (int i = 0; i< productPrice.size(); i++){
            System.out.println("Product: " +productName.get(i) + " Product Price: " +productPrice.get(i) + " Product Amount: " +productAmount.get(i));
        }
    }
}

