package javaSE_general_practice.array_practice;

import java.util.Arrays;

public class udemy_array_practice {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        Integer[] arr= new Integer[8];
        System.out.println(arr.toString());
        for (int i = 1; i < 11; i++) {
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
