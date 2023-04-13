package collection;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> fivePrime = new ArrayList<>();
        fivePrime.add(1);
        fivePrime.add(3);
        fivePrime.add(5);
        fivePrime.add(7);
        fivePrime.add(11);
        System.out.println(fivePrime);

        //create new arraylist
        List<Integer> nextTenPrime= new ArrayList<>(fivePrime);
        List<Integer> nextFivePrime= new ArrayList<>();

        nextFivePrime.add(13);
        nextFivePrime.add(17);
        nextFivePrime.add(19);
        nextFivePrime.add(23);
        nextFivePrime.add(29);
        System.out.println(nextFivePrime);

        //adding previous collection
        nextTenPrime.addAll(nextFivePrime);
        System.out.println(nextTenPrime);


    }
}
