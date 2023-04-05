package HomeWorks;

import java.io.PrintStream;

public class Customer {


    private String customerName;
    private String address;
    private String email;
    private Product[] purchasedProducts= new Product[getPurchasedProducts().length];
    public String getCustomerName() {
        return customerName;
    }
    public Customer(String customerName, String address, String email, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }
    public void getCustomerInfo() {
        System.out.println("Customer Name: "+customerName);
        System.out.println("Customer address: "+address);
        System.out.println("Customer email: "+email);
        System.out.println("Products by Customer" + purchasedProducts[20]);
    }
}
