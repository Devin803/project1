import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
    public static void main(String [] args)
    {
        ArrayList<String> productName = new ArrayList<String>();
        ArrayList<Float> productPrice = new ArrayList<Float>();
        ArrayList<Integer> productCount = new ArrayList<Integer>();

        try
        {
            File file = new File("products.txt");
            Scanner reader = new Scanner(file);
            String[] arr;

            while(reader.hasNextLine())
            {
                arr = reader.nextLine().split(" ");
                productName.add(arr[0]);
                productPrice.add(Float.parseFloat(arr[1]));
                productCount.add(Integer.parseInt(arr[2]));
            }
            reader.close();

        Scanner input = new Scanner(System.in);
        int choice;
        String prod;
        boolean found;
        while(true)
        {
            found = false;
            System.out.println("Do you wish to exit? Press 0, else press 1: ");
            choice = input.nextInt();
            if (choice == 0)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Which product are you looking for?");
                prod = input.next();

                for(int i=0; i<productName.size(); ++i)
                {
                    if(productName.get(i).equalsIgnoreCase(prod))
                    {
                        System.out.println("The count of the product: " + prod + " is: " + productCount.get(i));
                        System.out.println("The amount of the product: " + prod + " is: " + productPrice.get(i));
                        found = true;
                        break;
                    }
                }

                if(found == false)
                {
                    System.out.println("Sorry, we don't have that product");
                }
            }
        }
    }
        catch (Exception e)
        {
        }

        }
}