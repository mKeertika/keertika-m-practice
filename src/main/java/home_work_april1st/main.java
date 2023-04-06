package home_work_april1st;

import home_work_april1st.address.CustomerAddress;

public class main {
    public static void main(String[] args) {

        Product product1 = new Product("TV", 500.0);
        Product product2 = new Product("Laptop", 1500.0);

        CustomerAddress[] customerAddresses = new CustomerAddress[100];
        CustomerAddress cAddress1= new CustomerAddress(true, 123, "Custor road", "Frisco", "Texas");

        Customer customer1 = new Customer("Keertika", new CustomerAddress[]{cAddress1}, "abc@xyz.com",
                new Product[]{product1, product2});
        customer1.getCustomerInfo();
    }
}
