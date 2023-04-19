package exercise_sba_mock.exercise1;

import java.util.ArrayList;

public class MyOperation implements IMyOperations {
    private ArrayList<String> myArrayList = new ArrayList<>();
    ArrayList<String> newMyArrayList = new ArrayList<>();

    //Constructor

    public MyOperation() {
    }

    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {

        //or may be suggested by intelliJ
//         myArrayList.addAll(List.of(stringArray));

        for (String i : stringArray) {
            myArrayList.add(i);
        }
    }

    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {

        myArrayList.set(index, "Nah");
    }

    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        for (String i : myArrayList) {
            if (!i.equals("Nah")) {
                newMyArrayList.add(i);
            }
        }
        return newMyArrayList;
    }

    //Getter

    public ArrayList<String> getMyArrayList() {
        return myArrayList;
    }

    public ArrayList<String> getNewMyArrayList() {
        return newMyArrayList;
    }
}
