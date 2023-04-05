package student_record;

public class ReturnClass {
    public  void method1() {
        method2();
        System.out.println(method2());
    }
    public boolean method2() {
        return false;
    }
}
