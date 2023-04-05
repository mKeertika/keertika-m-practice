package array_practice;

import java.util.Arrays;

/* Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
 Print the array in ascending order, and print the smallest and the largest
 element of the array. The output will look like the following:
 Array in ascending order: 0, 1, 2, 4, 9, 13
 The smallest number is 0
 The biggest number is 13 */
public class Main9 {
    public static void main(String[] args) {

        int[] arrayNum = {4, 2, 9, 13, 1, 0};
        int arrNumLength = arrayNum.length;
        //bubble sort algorithm steps
        //first for loop will count the array length
        for (int i = 0; i < arrNumLength-1 ; i++) {
            //second for loop compare in substring
            for (int j =0; j < arrNumLength - i-1  ; j++) {
                //compare values in pairs
                if (arrayNum[j] > arrayNum[j + 1]) {
                    int temp = arrayNum[j];
                    arrayNum[j] = arrayNum[j + 1];
                    //swapping values
                    arrayNum[j + 1] = temp;
                }
            }
        }
        //Print the array in ascending order
        System.out.println("Array in ascending order " + Arrays.toString(arrayNum));
        System.out.printf("The smallest number:" + arrayNum[0] + "%n");
        System.out.printf("The biggest number is:" + arrayNum[arrNumLength - 1] + "%n");
    }
}
