package javaSE_general_practice.string_practice_homework;
import java.util.Scanner;

public class PaddingString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = sc.nextLine();
        String paddedString="";

        for (int i = 0; i < str.length(); i++) {
            paddedString=paddedString+(str.charAt(i)*i);
        }
        System.out.println(paddedString.toString());
    }
}
