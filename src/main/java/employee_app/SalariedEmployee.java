package employee_app;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    //Constructor
    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {

        super(name, hireDate);
        this.monthlySalary= monthlySalary;
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    @Override
    public String getEmployeeInfo() {
        return null;
    }

    @Override
    public String getEmployeeInfo(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        return null;
    }

    @Override
    public String getEmployeeInfo(
            String name,
            LocalDate hireDate,
            double monthlySalary) {
        String outPut = "Employee "+ name +
                " is hired on "+ hireDate +
                " and "+name+"'s monthly salary is "+ monthlySalary;
        return outPut;
    }
}
