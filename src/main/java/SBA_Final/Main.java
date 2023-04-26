package SBA_Final;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayToList arrayToList = new ArrayToList();
        arrayToList.convert(new String[]{"i love java" });
        arrayToList.convert(new String[]{"1234" });
        arrayToList.convert(new String[]{"" });
    }
    }
interface MyList{
    void convert(String[] a);
    void replace(int idx);
    ArrayList<String> compact();
}
    class ArrayToList implements MyList{
    ArrayList<String> arrayToList ;

//    Constructor

        public ArrayToList() {
            arrayToList= new ArrayList<>();
            this.arrayToList = arrayToList;
        }

        @Override
        public void convert(String[] a) {
            for (int i=0; i< a.length; i++){
                arrayToList.add(a[i]);
                System.out.println("I have added the string: "+a[i]+ ", at the index: "+ i);
            }

        }

        @Override
        public void replace(int idx) {
            arrayToList.set(idx, "");

        }

        @Override
        public ArrayList<String> compact() {
            ArrayList<String> newList = new ArrayList<>();
            for (String i : arrayToList) {
                if(!i.equals(" ")) {
                    newList.add(i);
                }
            }
            return newList;
        }
    }
