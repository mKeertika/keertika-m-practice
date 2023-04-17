package collections_practice.list_practice;
import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : "+ names.contains("Bob"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve") );
        System.out.println("indexOf \"Maria\": " + names.indexOf("Maria") );
        System.out.println("indexOf \"Keertika\": " + names.indexOf("Keertika") );

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"Maria\" : " + names.lastIndexOf("Maria"));
        System.out.println("lastIndexOf \"Keertika\" : " + names.lastIndexOf("Keertika"));
    }
}
