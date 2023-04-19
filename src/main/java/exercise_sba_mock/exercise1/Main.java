package exercise_sba_mock.exercise1;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String[] myStringArrayTestValue = {"life", "is", "worth", "living", "with", "passion" };

//        Creating object of Class MyOperation
        MyOperation myOperation = new MyOperation();

        //Printing PART#3
        System.out.println("================Printing PART#3 of mock SBA====================");
        myOperation.convertStringArrayIntoArrayList(myStringArrayTestValue);
        ArrayList<String> myArrayList = myOperation.getMyArrayList();
        System.out.println(myArrayList);
        System.out.println("");

        //PART#4
        System.out.println("==================Printing PART#4 of mock SBA====================");
        myOperation.replaceAnElementInTheStringArrayListGiven(1);
        System.out.println(myArrayList);
        System.out.println("");

//        PART#5
        System.out.println("==================Printing PART#5 of mock SBA====================");
        myOperation.createANewArrayListFromExistingArray();
        ArrayList<String> myArrayListAfterEdit = myOperation.getNewMyArrayList();
        System.out.println(myArrayListAfterEdit);
        System.out.println("");

//        PART#6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");

//Validate Integer value
        if (sc.hasNextInt()) {
            //reading value in sc
            int i = sc.nextInt();
            System.out.println("Integer Value is : " + i);
        } else {
            try {
                throw new MyOwnException("Please enter a valid integer. try again");
            } catch (MyOwnException e) {
                System.out.println(e.getMessage());

            }
        }

        sc.close();
    }
}


