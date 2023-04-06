package home_work_march31;

public class MainHomeworkMarch31st {
    public static void main(String[] args) {

        Product product1 = new Product("TV", 500.0);
        Product product2 = new Product("Laptop", 1500.0);

        Customer customer1 = new Customer("Keertika", "Frisco", "abc@xyz.com",
                new Product[]{product1, product2});
        customer1.getCustomerInfo();
    }
}

