package sba_mock_exercise1;

import java.util.ArrayList;


public interface IMyOperations {
    void convertStringArrayIntoArrayList(String[] stringArray);

    void replaceAnElementInTheStringArrayListGiven(int index);

    ArrayList<String> createANewArrayListFromExistingArray();
}
