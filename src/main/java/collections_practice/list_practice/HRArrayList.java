package collections_practice.list_practice;
import java.util.*;

public class HRArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //read list of Integers
        System.out.println("enter number of elements in list: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
// entering list elements
        for (int i = 0; i <n; i++) {
            System.out.println("enter elements: ");
            list.add(sc.nextInt());
        }
        System.out.println("you created List: "+ list);

        //perform queries
        System.out.println("Enter number of queries you have: ");
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter query");
            String query= sc.next();
            if(query.equals("insert")){
                System.out.println("enter integer value of index: ");
                int index= sc.nextInt();
                System.out.println("enter string value of value: ");
                int value= sc.nextInt();
                list.add(index, value);
            }
else if (query.equals("delete")){
                System.out.println("enter int value of index");
                int index = sc.nextInt();
                list.remove(index);
            }
            System.out.println("this is list after "+ query+": "+list);
        }
    }

}
