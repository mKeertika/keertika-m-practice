package hw_march31;

public class Customer {

    //private int customerCount;
    private String customerName;
    private String address;
    private String email;
    private Product[] purchasedProducts;

    //Constructor
    public Customer(String customerName, String address, String email, Product[] products) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.purchasedProducts = products;
    }

    //getting customer info which will invoked in TestMonster method of the package
        public void getCustomerInfo() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer address: " + address);
            System.out.println("Customer email: " + email);
            System.out.println("Customer Products: " + productsOfCustomer());
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

    public String getCustomerName() {
        return customerName;
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
}
