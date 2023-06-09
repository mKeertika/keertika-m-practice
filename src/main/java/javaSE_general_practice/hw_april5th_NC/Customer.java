package javaSE_general_practice.hw_april5th_NC;

import javaSE_general_practice.hw_april5th_NC.address.CustomerAddress;

public class Customer {
     //private int customerCount;
    //private String customerName;
    CustomerName customerName;
    private String email;
    private Product[] purchasedProducts;
    private CustomerAddress[] addresses;

    //Constructor
    public Customer(CustomerName customerName, CustomerAddress[] addresses, String email, Product[] products) {
        this.customerName = customerName;
        this.addresses = addresses;
        this.email = email;
        this.purchasedProducts = products;
    }

    //getting customer info which will invoked in TestMonster method of the package
    public String getCustomerInfo() {
        System.out.println("Customer Name: " + customerName.customerFullName());
        System.out.println("Customer address: " + customerAdd());
        System.out.println("Customer email: " + email);
        System.out.println("Customer Products" + productsOfCustomer());
        return null;
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
    //getting Customer Address in Array
    public String customerAdd() {
        String address = "";
        for (int j = 1; j < addresses.length; j++) {
            if (addresses[j] == null) {
                break;
            }
            address += "is this primary address" + addresses[j].isPrimaryAddress() + " " + addresses[j].getStreetNumber() + " " + addresses[j].getStreetName() +
                    "\n" + addresses[j].getCity() + ", " + addresses[j].getState();
        }
        return address;
    }
}
