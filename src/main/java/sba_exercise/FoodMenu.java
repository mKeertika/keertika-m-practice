package sba_exercise;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) throws FileNotFoundException {

//        creating MySystem class object
        MySystem mySystem = new MySystem();
       //printing output calling through MySystem constructor
        System.out.println(mySystem.getMyItemsInHashMap());

        //defining file to take input from a particular file
        File sample = new File("sample.txt");
        Scanner sc = new Scanner(sample);

        System.out.println("----------- Testing reading sample.txt ----- ");
        System.out.printf("%-20s %-20s %-10s %-10s %n", "Name", "Description", "Price", "Available Quantity");

        while(sc.hasNextLine()){
        String inputItems1 = sc.nextLine();
        //separating sentence into strings under name, description, price and avail quantity
        String[] inputItems= inputItems1.split("  ");
        String name= inputItems[0];
        String description= inputItems[1];
        double price=Double.parseDouble(inputItems[2]);
        int availQuantity= Integer.parseInt(inputItems[3]);
            System.out.printf("%-20s %-20s %-10.2f %-10d %n", name, description, price, availQuantity);

        }
        sc.close();

        //taking input from console
        Item item1 = new Item("new item", "spicy one", 23.0,3);
        System.out.println("\n----------- Taking Input from Console ----- ");
        System.out.printf("%-20s %-20s %-10.2f %-10d %n",item1.getName(), item1.getDescription() , item1.getPrice(), item1.getAvailableQuantity());

    }
}
