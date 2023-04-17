package map_practice1;

public class Item {

    private String name;
    private String description;
    private double price;
    private int availableQuantity;

    //Constructor

    public Item(String name, String description, double price, int availableQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }
}
