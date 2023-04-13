package collection;
import  java.util.List;
import  java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        List<String> animals= new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Boar");
        animals.add("Deer");
        animals.add("fox");
        System.out.println(animals);

        //adding element at particular index

        animals.add(1,"Cat");
        System.out.println(animals);
    }
}
