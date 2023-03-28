package arrayPractice;

import java.util.Scanner;

/* Read a line of text such as “I love Java.  You love Java. She loves Java.”
 Split them into words
 Count number of times each word (excluding dot .) occurs
 So the end result is something like following:
 "I" occurs once
 "love" occurs twice
 "Java" occurs 3 times
 "You" occurs once
 "She" occurs once
 "loves" occurs once*/
public class HomeWork27March {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String readString = sc.nextLine();
        int strLength= readString.length();

        for (int i = 0; i <strLength ; i++) {
            for (int j = 0; j <strLength-1 ; j++) {
                
            }
            
        }
    }
}
