package map_practice1;

public class Main {
    public static void main(String[] args) {
        try {
            int a, b;
            b = 0;
            a = 5 / b;
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        }
    }
}
