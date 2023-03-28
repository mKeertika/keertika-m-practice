package arrayPractice;

/*Write a program that creates an integer array with 5 elements (i.e., numbers).
 The numbers can be any integers. Print out the value at the first index and the
 last index using length - 1 as the index. Now try printing the value at index =
 length ( e.g., myArray[myArray.length ] ). Notice the type of exception which is
 produced. Now try to assign a value to the array index 5. You should get the
 same type of exception.*/
public class Main4 {
    public static void main(String[] args) {

        int[] arr = {34, 5, 7, 3, 5};
        int arrLength = arr.length;
        System.out.println("first index value is: " + arr[0]);
        System.out.println("Last index value is: " + arr[arrLength - 1]);
        int ind = arr[arr.length];
        System.out.println("desired index value: " + ind);
        arr[5]=arr[arr.length] ;
        System.out.println("print value of arr5: " + arr[5]);

    }
}
