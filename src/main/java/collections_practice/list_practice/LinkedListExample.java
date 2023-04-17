package collections_practice.list_practice;
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

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedlist);

        /*This is how to get and set Values*/
        Object firstVar = linkedlist.get(0);
        System.out.println("First element: " +firstVar);
        linkedlist.set(0, "Changed first item");
        Object firstVar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstVar2);


        /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

        /* Add to a Position and remove from a position*/
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);

    }
}
