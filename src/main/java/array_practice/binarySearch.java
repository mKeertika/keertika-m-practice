package array_practice;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int targetValue = 0;
        int[] arrNum = {3, 5, 6, 2, 67, 32, 89, -67, -87, -12, 0};
        Arrays.sort(arrNum);
        int startIndex = 0;
        int endIndex = arrNum.length-1;
        int midIndex = (arrNum.length-1) / 2;
        System.out.println("Arr length " + endIndex);
        System.out.println("to check " + Arrays.toString(arrNum));
        while (startIndex <= endIndex) {
            int arrMid = (startIndex+endIndex) / 2;
            if (arrNum[midIndex] == targetValue) {
                System.out.println("Target element is mid element: " + targetValue);
                break;
            } else if (arrNum[midIndex] < targetValue) {
               startIndex = midIndex + 1;
                System.out.println("< " + targetValue);
                break;
            } else if (arrNum[midIndex] >targetValue) {
                endIndex  = midIndex - 1;
                System.out.println("> " + targetValue);
                break;
            } else {
                System.out.println("Target not found in this array");
            }
        }
    }
}
