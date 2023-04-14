package employee_app;
import java.time.*;

public abstract class Employee {

    private String name;
    private LocalDate hireDate;
    private final LocalDate currentDate = LocalDate.now();

    //Constructor
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract String getEmployeeInfo(
            String name,
            LocalDate hireDate,
            double monthlySalary);

    public abstract String getEmployeeInfo();
//    {
//        return ("name = " + name + "; hireDate = " +
//                hireDate);
//    }

    //to compute total monthly compensation for all employee

    public abstract double computeMonthlyCompensation();

    //compute working year logic
    public int computeNumberOfYearsWorkedSinceHired() {

        return (currentDate.getYear() - hireDate.getYear());
    }

    public String getName() {
        return name;
    }

    public String work() {
        return name+" worked";
    }

    public abstract String getEmployeeInfo(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate);
}