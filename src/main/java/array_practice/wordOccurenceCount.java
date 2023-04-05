package array_practice;
import java.util.*;

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
public class wordOccurenceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String inputString = sc.nextLine();
        String[] newStringOfWords = inputString.split("[\\s\\.,]+");
//        String[] uniqueWordsArr = getUniqueWords(newStringOfWords);
//        int[] wordCount = new int[uniqueWordsArr.length];
//        for (int i = 0; i < uniqueWordsArr.length; i++) {
//            for (String word : newStringOfWords) {
//                if (uniqueWordsArr[i].equals(word)) {
//                    wordCount[i]++;
//                }
//            }
//        }
//        for (int i = 0; i < uniqueWordsArr.length; i++) {
//            System.out.println(uniqueWordsArr[i] + " = " + wordCount[i]);
//        }
    }

    private static String[] getUniqueWords(String[] words) {
        String input = "the quick brown fox jumps over the lazy dog the quick brown dog jumps over the lazy fox";
        String[] wordsAfterSplit = input.split("\\s+"); // split the input string into words

        String output = "";

        for (int i = 0; i < wordsAfterSplit.length; i++) {
            String word = wordsAfterSplit[i];
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (wordsAfterSplit[j].equals(word)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                output += word + " ";
            }
        }
        //System.out.println(output.trim());
        return wordsAfterSplit;
    }
}


