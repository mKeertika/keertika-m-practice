package sba_mock_exercise1;

import java.util.InputMismatchException;

public class MyOwnException extends InputMismatchException {
    public MyOwnException(String msg) {
        super(msg);
    }
}
