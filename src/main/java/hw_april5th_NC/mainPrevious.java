package hw_april5th_NC;

import hw_april5th_NC.address.CustomerAddress;

public class mainPrevious {
    public static void main1(String[] args) {

        Product product1 = new Product("TV", 500.0);
        Product product2 = new Product("Laptop", 1500.0);

        CustomerName name = new CustomerName("I", "me",
                "myself");

        CustomerAddress[] customerAddresses = new CustomerAddress[100];
        CustomerAddress cAddress1 = new CustomerAddress(true,
                123, "Custor road", "Frisco",
                "Texas");

        Customer customer1 = new Customer(name, new CustomerAddress[]{cAddress1}, "abc@xyz.com",
        new Product[]{product1, product2});

        customer1.getCustomerInfo();
    }
}
