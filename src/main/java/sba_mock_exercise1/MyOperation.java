package sba_mock_exercise1;

import java.util.ArrayList;

public class MyOperation implements IMyOperations {
    private ArrayList<String> myArrayList;

    //Constructor

    public MyOperation() {
        myArrayList = new ArrayList<>();
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
        ArrayList<String> newMyArrayList = new ArrayList<>();
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
}
