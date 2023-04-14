package employee_app.com.hr.personnel;
import java.util.List;
import java.util.ArrayList;

public class Department {

    private String name;
    private String location;
    //private Employee[] employees = new Employee[100];
    private List<Employee> employees= new ArrayList<>();
    //private int currentIndex = 0; // indicates the empty array slot to use for adding an Employee object
    SalariedEmployee salEmp;
    HourlyEmployee hourEmp;


    public void addEmployee(Employee employee){
        employees.add(employee);
//        employees[currentIndex]= employee;
//        currentIndex++;
    }


    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int employeesWorked = 0;

        for (int i = 0; i < employees.size(); i++) {
                String worked = employees.get(i).work();
                if (worked.contains("worked")) {
                    employeesWorked++;
            }
        }
        return employeesWorked;
    }

    public double computeDepartmentMonthlyTotalCompensation(){
        // TODO: add code here
        double totalCompensation=0.0;

        for (int i = 0; i <employees.size() ; i++) {
            double monthlyCompensation = employees.get(i).computeMonthlyCompensation() ;
            totalCompensation+= monthlyCompensation;
        }
        return totalCompensation;
    }
}
