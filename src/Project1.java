import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
    public static void main(String [] args) throws IOException {
        var fileName = "products.txt";
        var product = Paths.get(fileName);
        var productName =  new ArrayList<String>();
        var productPrice = new ArrayList<Float>();
        var productAmount = new ArrayList<Integer>();
        var productLines = Files.readAllLines(product);
        var userResponse = "";
        var reader = new Scanner(System.in);
        for (var line : productLines){
            var splitLine = line.split(",");
            productName.add(splitLine[0]);
            var productP = Float.parseFloat(splitLine[1]);
            productPrice.add(productP);
            var productA = Integer.parseInt(splitLine[2]);
            productAmount.add(productA);
        }
        while (!userResponse.equals("done")){
            System.out.println("What do you want to search for?");
            if(userResponse.equals("products")){
                System.out.println("There are" + productName + " The price is: " + productPrice + " The amount is:" + productAmount );
            }
            userResponse = reader.nextLine();
            if (!userResponse.equals("products")){
                System.out.println("Sorry, there arent any of that product");
            }
        }
    }
}