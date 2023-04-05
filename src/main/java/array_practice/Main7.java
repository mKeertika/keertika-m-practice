package array_practice;

/* Write a program where you create an array of 5 elements. Loop through the
 array and print the value of each element, except for the middle (index 2)
 element.*/
public class Main7 {
    public static void main(String[] args) {

        //create an integer array with a length of 5
        String[] arrayColors = {"red", "blue", "pink", "orange", "wine"};
        int middleInd = (arrayColors.length) / 2;
        for (int i = 0; i < arrayColors.length; i++) {
            if (i == middleInd) {
                continue;
            }
            System.out.println(arrayColors[i]);
        }
    }
}
