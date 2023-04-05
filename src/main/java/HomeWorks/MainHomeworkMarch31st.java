package HomeWorks;

public class MainHomeworkMarch31st {
    public static void main(String[] args) {
                MyClass myObject = new MyClass(20);
                System.out.println(myObject.getValue());
            }

        }

        class MyClass {
           private int value = 10;

            public MyClass(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }
//        }
//
//        Product product1 = new Product("TV", 500.0);
//        Product product2 = new Product("Laptop", 1500.0);
//        Product[] purchasedProducts = {product1, product2};
//
//        Customer customer1 = new Customer("Keertika", "3700 frisco", "abc@xyz.com", purchasedProducts);
//        customer1.getCustomerInfo();


}
