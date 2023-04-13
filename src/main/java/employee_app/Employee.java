package employee_app;
import java.time.*;

public class Employee {

    private String name;
    private LocalDate hireDate;
    private final LocalDate currentDate = LocalDate.now();

    //Constructor
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    //compute working year logic
    public int computeNumberOfYearsWorkedSinceHired() {
        return (currentDate.getYear() - hireDate.getYear());
    }

    public String getEmployeeInfo() {
        return ("name = " + name + "; hireDate = " +
                hireDate);
    }
    public double computeMonthlyCompensation() {
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public String work() {
        return name+" worked";
    }
}