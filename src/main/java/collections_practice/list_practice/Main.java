package collections_practice.list_practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else if (n % 2 == 0 && 2 <= n && n <= 5) {
                System.out.println("Not Weird");
            } else if (n % 2 == 0 && 5 < n && n < 21) {
                System.out.println("Weird");
            } else if (n % 2 == 0 && n > 20) {
                System.out.println("Not Weird");
        }
        scanner.close();
    }
}
