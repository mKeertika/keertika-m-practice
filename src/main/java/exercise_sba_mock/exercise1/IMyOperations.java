package exercise_sba_mock.exercise1;

import java.util.ArrayList;


public interface IMyOperations {
    void convertStringArrayIntoArrayList(String[] stringArray);

    void replaceAnElementInTheStringArrayListGiven(int index);

    ArrayList<String> createANewArrayListFromExistingArray();
}
