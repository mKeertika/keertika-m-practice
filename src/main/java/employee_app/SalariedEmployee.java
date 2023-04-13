package employee_app;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    //Constructor
    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }
}
