package employee_app.com.hr.personnel;

import java.time.*;

import employee_app.Employee;
import employee_app.HourlyEmployee;
import employee_app.SalariedEmployee;

public class HRClient {
//    public static void main1(String[] args) {
//        Employee emp1 = new Employee("Mia", LocalDate.of(2002, 02, 22));
//        Employee emp2 = new Employee("Keertika", LocalDate.of(2012, 07, 12));
//        System.out.println(emp1.getEmployeeInfo());
//        System.out.println(emp2.getEmployeeInfo());
//        System.out.println("\nTotal working years of " + emp1.getName() + " is " + emp1.computeNumberOfYearsWorkedSinceHired() + " years");
//        System.out.println("Total working years of " + emp2.getName() + " is " + emp2.computeNumberOfYearsWorkedSinceHired() + " years");
//    }

    public static void main(String[] args) {
        SalariedEmployee salEmp1 =new SalariedEmployee("teena", LocalDate.of(2002,
                05,9));
        SalariedEmployee salEmp2 = new SalariedEmployee("sara", LocalDate.of(2012,
                02,12));
        HourlyEmployee hourEmp = new HourlyEmployee("gretchen", LocalDate.of(2011,
                01,24));


    }
}
