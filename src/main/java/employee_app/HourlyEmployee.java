package employee_app;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    //Constructor
    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    @Override
    public double computeMonthlyCompensation() {
//        total number of emp
        return (hoursWorkedPerMonth *hourlyRate);
    }
}
