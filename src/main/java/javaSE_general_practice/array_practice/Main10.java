package javaSE_general_practice.array_practice;
import java.util.Arrays;
import java.util.Scanner;

/* Write some Java code that asks the user how many favorite things they have.
 Based on their answer, you should create a String array of the correct size. Then
 ask the user to enter the things and store them in the array you created. Finally,
 print out the contents of the array. */
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many favorite things you have: ");
        int num = sc.nextInt();
        String[] favThingsArray = new String[num];
        for (int i = 0; i < num; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.printf(" Enter fav thing %d: ", (i + 1));
            String favThing = sc1.nextLine();
            favThingsArray[i] = favThing;
        }
        System.out.println(Arrays.toString(favThingsArray));
    }
}
