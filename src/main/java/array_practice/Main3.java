package array_practice;
/*Write a program that creates an array of String type and initializes it with the
 strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a
 copy using the clone( ) method. Use the Arrays.toString( ) method on the new
 array to verify that the original array was copied.*/

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        //String type and initializes it with the strings
        String[] colorArr ={"red", "green","blue", "yellow"};
        System.out.println("length of the array is: "+ colorArr.length);
        //clone the array
        String [] cloneColorArr= colorArr.clone();
        System.out.println("New CLONED array is: "+ Arrays.toString(cloneColorArr));

    }
}
