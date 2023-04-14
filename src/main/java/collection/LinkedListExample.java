package collection;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedlist= new LinkedList<>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        System.out.println("All linked list items are: "+ linkedlist);

        linkedlist.addFirst("Random Item");
        System.out.println("now linked list after adding random item:" + linkedlist);

    }
}
