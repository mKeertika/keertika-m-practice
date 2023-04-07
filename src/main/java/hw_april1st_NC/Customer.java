package hw_april1st_NC;

import hw_april1st_NC.address.CustomerAddress;

public class Customer {
    //private int customerCount;
    private String customerName;
    private String email;
    private Product[] purchasedProducts;
    private CustomerAddress addresses;

    //Constructor
    public Customer(String customerName, CustomerAddress addresses, String email, Product[] products) {
        this.customerName = customerName;
        this.addresses = addresses;
        this.email = email;
        this.purchasedProducts = products;
    }

    //getting customer info which will invoked in Main method of the package
    public void getCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer address: " + addresses.customerAdd());
        System.out.println("Customer email: " + email);
        System.out.println("Customer Products" + productsOfCustomer());
    }

    //getting the of products of customer in array
    public String productsOfCustomer() {
        String result = "";
        for (int i = 0; i < purchasedProducts.length; i++) {
            if (purchasedProducts[i] == null) {
                break;
            }
            result += purchasedProducts[i].getProductName() + ",  " + purchasedProducts[i].getPrice() + "\n";

        }
        return result;
    }
}
