package employee_app;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    //Constructor
    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }


    @Override
    public double computeMonthlyCompensation() {
//        total number of emp
        return (hoursWorkedPerMonth *hourlyRate);
    }


    @Override
    public String getEmployeeInfo() {
        return getName();
    }
    @Override
    public String getEmployeeInfo(String name, LocalDate hireDate, double monthlySalary) {
        return null;
    }
    @Override
    public String getEmployeeInfo(
            String name,
            LocalDate hireDate,
            int hoursWorkedPerMonth,
            double hourlyRate) {
        String outPut = "Employee "+ name +
                " hired on "+ hireDate+
                ", whose total working hour are "+ hoursWorkedPerMonth
                +", hourly rate "+ hourlyRate;
        return outPut;
    }
}
