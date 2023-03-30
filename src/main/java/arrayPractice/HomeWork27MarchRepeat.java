package arrayPractice;
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
public class HomeWork27MarchRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String readString = sc.nextLine();
        String[] words = readString.split("[\\s\\.,]+");
        String[] uniqueWordsArr = getUniqueWords(words);
        int[] wordCount = new int[uniqueWordsArr.length];
        for (int i = 0; i < uniqueWordsArr.length; i++) {
            for (String word : words) {
                if (uniqueWordsArr[i].equals(word)) {
                    wordCount[i]++;
                }
            }
        }
        for (int i = 0; i < uniqueWordsArr.length; i++) {
            System.out.println(uniqueWordsArr[i] + " = " + wordCount[i]);
        }
    }

    private static String[] getUniqueWords(String[] words) {
        List<String> uniqueWordsList = new ArrayList<>();
        for (String word : words) {
            if (!uniqueWordsList.contains(word)) {
                uniqueWordsList.add(word);
            }
        }
        String[] uniqueWords = new String[uniqueWordsList.size()];
        uniqueWords = uniqueWordsList.toArray(uniqueWords);
        return uniqueWords;

    }
}


