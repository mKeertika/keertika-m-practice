package collections_practice.list_practice;
import  java.util.List;
import  java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        List<String> animals= new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Boar");
        animals.add("Deer");
        animals.add("fox");
        System.out.println(animals);
        animals.remove(3);

        //adding element at particular index

        animals.add(1,"Cat");
        System.out.println(animals);
    }
}
