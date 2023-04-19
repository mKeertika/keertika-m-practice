package exercise_sba_hashmap;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MySystem {

    private Map<String, Item> myItemsInHashMap ;


    public Item addItem(Item item){

        return null;
    }


    //Constructor
    public MySystem() throws FileNotFoundException {
        myItemsInHashMap= new HashMap<>();

        //read text from sample.txt
        File sampleFile= new File("sample.txt");
        Scanner sc = new Scanner(sampleFile);

        System.out.println("----------- Testing the constructor of MySystem class ----- (newly added)");
        System.out.printf("%-20s %-20s %-10s %-10s %n", "Name", "Description", "Price", "Available Quantity");

        //create hashmap counter
        int line=0;

        while (sc.hasNextLine()){
            String itemInputFromSample = sc.nextLine();
            String[] splitStringOfItems = itemInputFromSample.split("  ");
            String itemName= splitStringOfItems[0];
            String description= splitStringOfItems[1];
            double price = Double.parseDouble(splitStringOfItems[2]);
            int quantity= Integer.parseInt(splitStringOfItems[3]);

            Item foodMenu =  new Item(itemName, description, price, quantity);
            myItemsInHashMap.put(itemName, foodMenu);

            System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                    foodMenu.getName(),
                    foodMenu.getDescription(),
                    foodMenu.getPrice(),
                    foodMenu.getAvailableQuantity());
        }
    }



    //getter & setter methods
    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;

    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }
}
