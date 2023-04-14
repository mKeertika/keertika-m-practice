package collection;
import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {

        List<String> programmingLanguage = new ArrayList<>();
        programmingLanguage.add("C");
        programmingLanguage.add("C++");
        programmingLanguage.add("Java");
        programmingLanguage.add("Kotlin");
        programmingLanguage.add("Python");
        programmingLanguage.add("Pearl");
        programmingLanguage.add("Ruby");

        System.out.println("Initial List: " + programmingLanguage);

//        remove index at index 5
        programmingLanguage.remove(5);
        System.out.println("List after edit index at 5: "+programmingLanguage);

//        remove object
        boolean isRemove= programmingLanguage.remove("Kotlin");
        System.out.println("whether Kotlin exists in List: "+ isRemove);
        System.out.println("After removing Kotlin in list" + programmingLanguage);

//        Remove all
        List<String> scriptingLanguage= new ArrayList<>();
        scriptingLanguage.add("Python");
        scriptingLanguage.add("Ruby");
        scriptingLanguage.add("Pearl");

        programmingLanguage.removeAll(scriptingLanguage);
        System.out.println("List after remove all scripting language: "+ programmingLanguage);

//        remove all elements from list
        programmingLanguage.clear();
        System.out.println("List after using clear() method: "+ programmingLanguage);


    }
}
