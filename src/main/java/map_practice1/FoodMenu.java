package map_practice1;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) throws FileNotFoundException {

        File sample = new File("sample.txt");
        Scanner sc = new Scanner(sample);


        System.out.println("/n----------- Testing reading sample.txt ----- ");
        System.out.printf("%-20s %-20s %-10s %-10s %n", "Name", "Description", "Price", "Available Quantity");
        int line=0;
        while(sc.hasNextLine()){
        String[] inputItems = sc.nextLine().split("  ");
        String name= inputItems[0];
        String description= inputItems[1];
        double price=Double.parseDouble(inputItems[2]);
        int availQuantity= Integer.parseInt(inputItems[3]);
            System.out.printf("%-20s %-20s %-10.2f %-10d %n", name, description, price, availQuantity);
        }
        sc.close();


        Map<String, Item> stringItemHashMap = new HashMap<>();
    }
}
