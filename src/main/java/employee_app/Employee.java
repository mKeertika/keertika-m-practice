package employee_app;
import java.time.*;
import java.time.chrono.ChronoLocalDate;

public class Employee {

    private String name;
    private LocalDate hireDate;
    private LocalDate currentdate= LocalDate.now();

    //Constructor
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    //compute working year logic
    public int computeNumberOfYearsWorkedSinceHired(){
        return (currentdate.getYear() - hireDate.getYear());
    }

    public String getEmployeeInfo() {
        return ("name = "+ name +"; hireDate = "+
                hireDate);
    }

    public String getName() {
        return name;
    }

    public String work() {
        return ("Mike worked.");
    }
}
