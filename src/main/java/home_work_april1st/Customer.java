package home_work_april1st;

import home_work_april1st.address.CustomerAddress;

public class Customer {

    //private int customerCount;
    private String customerName;
    //private String address;
    private String email;
    private Product[] purchasedProducts;
    private CustomerAddress[] addresses;

    //Constructor
    public Customer(String customerName, CustomerAddress[] addresses, String email, Product[] products) {
        this.customerName = customerName;
        this.addresses = addresses;
        this.email = email;
        this.purchasedProducts = products;
    }

    //getting customer info which will invoked in main method of the package
    public void getCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer address: " + customerAdd());
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
