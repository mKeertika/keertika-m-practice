package home_work_april1st;

public class Product {
    private String productName;
    private double price;

    //declaring Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // getter methods
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

}
