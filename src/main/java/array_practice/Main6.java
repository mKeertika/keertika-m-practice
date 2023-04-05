package array_practice;

import java.util.Arrays;

/*  Write a program where you create an integer array of 5 numbers. Loop through
 the array and assign the value of the loop control variable multiplied by 2 to the
 corresponding index in the array. */
public class Main6 {
    public static void main(String[] args) {

        //create an integer array with a length of 5
        int[] arrayNum = new int[5];
        for (int i = 0; i < arrayNum.length; i++) {
            //assigning the value
            arrayNum[i] = i * 2;
        }
        System.out.printf(Arrays.toString(arrayNum));
    }
}
