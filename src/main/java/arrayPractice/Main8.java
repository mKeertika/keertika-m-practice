package arrayPractice;

import java.util.Arrays;

/* Write a program that creates a String array of 5 elements and swaps the first
 element with the middle element without creating a new array. */
public class Main8 {
    public static void main(String[] args) {

        //create an integer array with a length of 5
        String[] arrayColors = {"red", "blue", "pink", "orange", "brown" };
        String temporary = arrayColors[0];
        //swaps the first element with the middle element
        arrayColors[((arrayColors.length) / 2)] = temporary;
        System.out.println(Arrays.toString(arrayColors));
    }
}
