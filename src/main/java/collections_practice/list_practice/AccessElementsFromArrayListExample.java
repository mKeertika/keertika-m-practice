package collections_practice.list_practice;

import java.util.List;
import java.util.ArrayList;


public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<Integer> element = new ArrayList<>();

        //Check if list empty
        System.out.println("If list empty: "+ element.isEmpty());

        element.add(2);
        element.add(12);
        element.add(22);
        element.add(32);
        element.add(42);
        System.out.println("Size of list is: "+ element.size());
        System.out.println("Value of element at index 2 is: "+
                element.get(2));
        System.out.println("Value of element at index 2 is: "+
                element.set(2,52));
        System.out.println(element.get(2));
    }
}
