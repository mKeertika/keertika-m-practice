package employee_app.com.hr.personnel;

import employee_app.Employee;

public class Department {

    private String name;
    private String location;
    Employee[] employees = new Employee[100];
    int currentIndex = 0; // indicates the empty array slot to use for adding an Employee object


    public void addEmployee(Employee employee){
        employees[currentIndex]= employee;
        currentIndex++;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {

        int employeesWorked = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                String worked = employees[i].work();
                if (worked.contains("worked")) {
                    employeesWorked++;
                }
            }
        }
        return employeesWorked;
    }
}
