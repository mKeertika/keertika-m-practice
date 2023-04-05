package array_practice;
/*Write a program where you create an integer array with a length of 5. Loop
 through the array and assign the value of the loop control variable (e.g., i) to
 the corresponding index in the array  */
public class Main5 {
    public static void main(String[] args) {
        //create an integer array with a length of 5
        int[] arrayNum= new int[5];
        for (int i=0; i< arrayNum.length; i++){
           //assigning the value
            arrayNum[i]=i;
            System.out.printf("array index %d is and value %d %n",i , arrayNum[i]);
        }
    }
}
