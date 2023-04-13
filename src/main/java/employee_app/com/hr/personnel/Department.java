package employee_app.com.hr.personnel;

import employee_app.Employee;
import employee_app.HourlyEmployee;
import employee_app.SalariedEmployee;

public class Department {

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0; // indicates the empty array slot to use for adding an Employee object
    SalariedEmployee salEmp;
    HourlyEmployee hourEmp;


    public void addEmployee(Employee employee){
        employees[currentIndex]= employee;
        currentIndex++;
    }


    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int employeesWorked = 0;

        for (int i = 0; i < currentIndex; i++) {
            if (employees[i] != null) {
                String worked = employees[i].work();
                if (worked.contains("worked")) {
                    employeesWorked++;
                }
            }
        }
        return employeesWorked;
    }

    public double computeDepartmentMonthlyTotalCompensation(){
        // TODO: add code here
        double totalCompensation=0.0;

        for (int i = 0; i <currentIndex ; i++) {
            double monthlyCompensation =  0;
            monthlyCompensation = employees[i].computeMonthlyCompensation() ;
            totalCompensation+= monthlyCompensation;
        }
        return totalCompensation;
    }
}
