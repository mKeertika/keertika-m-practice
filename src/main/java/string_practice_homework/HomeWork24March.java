package string_practice_homework;
import java.util.*;

/* Read a word from console using Scanner class - like “Java”
 Figure out the length of the word
 For each character of the word, pad the same character up to
  “length of the word” times according to their position in the
  string, so the end result should be “Jaavvvaaaa” for the word of “java”*/
public class HomeWork24March {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String word = sc.nextLine();
        int length = word.length();
        String reverseWord = " ";
        System.out.println("word length is: " + word.length());
        for (int i = 0; i <length; i++) {
        }
        for (int i = length - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        System.out.println("reverseWord: " + reverseWord);

}
    }