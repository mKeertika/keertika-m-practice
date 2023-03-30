package arrayPractice;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int count = 0, targetValue = 4;
        int[] arrNum = {3, 5, 6, 2, 67, 32, 89, -67, -87, -12, 0};
        Arrays.sort(arrNum);
        int arrLength = arrNum.length;
        int halfLength = arrNum.length / 2;
        System.out.println("Arr length " + arrLength);
        System.out.println("to check " + Arrays.toString(arrNum));
        while (arrNum[0] <= arrNum[arrLength-1]) {
            int arrMid = (0 + arrLength) / 2;

            if (arrNum[arrMid] == targetValue) {
                System.out.println("Target element is mid element: " + targetValue);
                break;
            } else if (targetValue > arrNum[arrMid]) {
                arrNum[0] = arrNum[halfLength + 1];
                count++;
                System.out.println("found in right side. After " + count + " iteration");
                break;
            } else if (targetValue < arrNum[arrMid]) {
                arrNum[arrLength] = arrNum[halfLength - 1];
                count++;
                System.out.println("found in left side after " + count + " iteration");
                break;
            } else {
                System.out.println("Target not found in this array");
            }
        }
    }
}
