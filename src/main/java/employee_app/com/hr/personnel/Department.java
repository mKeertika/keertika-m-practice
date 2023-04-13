package employee_app.com.hr.personnel;

import employee_app.Employee;
import employee_app.HourlyEmployee;
import employee_app.SalariedEmployee;

public class Department {

    private String name;
    private String location;
    Employee[] employees = new Employee[100];
    int currentIndex = 0; // indicates the empty array slot to use for adding an Employee object
    SalariedEmployee salEmp;
    HourlyEmployee hourEmp;


    public void addEmployee(Employee employee){
        employees[currentIndex]= employee;
        currentIndex++;
    }

    public double computeDepartmentMonthlyTotalCompensation(String type){
        // TODO: add code here
        // employees in that department
        //no of Salaried emp

        int noOfSalEmp = 0;
        int noOfHourlyEmp=0;
        if (type == "salaried"){
             noOfSalEmp += noOfSalEmp;
             return noOfSalEmp;
        }
        else if (type == "hourly"){
             noOfHourlyEmp= currentIndex- noOfSalEmp;
            return (noOfHourlyEmp);
        }
        else return 0;


//        // Compute total monthly compensation of all
//        double salComp= (noOfSalEmp * salEmp.computeMonthlyCompensation());
//        double hourComp= (noOfHourlyEmp*hourEmp.computeMonthlyCompensation());
//
//        double totalCompensation= (salComp+hourComp);
//        return totalCompensation;
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
