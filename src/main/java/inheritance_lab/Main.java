package inheritance_lab;

public class Main {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.setBark("xyz");
        System.out.println(sub.getBark());
        //Employee1 employee = new SalariedEmployee();
       // String name = employee.getName();
       // double salary = employee.getMonthlySalary();
    }
}