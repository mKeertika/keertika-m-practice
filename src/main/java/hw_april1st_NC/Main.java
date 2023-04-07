package hw_april1st_NC;

import hw_april1st_NC.address.CustomerAddress;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("TV", 500.0);
        Product product2 = new Product("Laptop", 1500.0);

       // CustomerAddress[] customerAddresses = new CustomerAddress[100];
        CustomerAddress cAddress1 = new CustomerAddress(false, 123, "Custor road", "Frisco", "Texas");

                Customer customer1 = new Customer("Keertika", cAddress1, "abc@xyz.com",
                new Product[]{product1, product2});

        customer1.getCustomerInfo();
    }
}
