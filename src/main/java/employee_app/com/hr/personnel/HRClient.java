package employee_app.com.hr.personnel;

import java.time.*;

import employee_app.Employee;
import employee_app.HourlyEmployee;
import employee_app.SalariedEmployee;

public class HRClient {

    //output of part 1
//    public static void main(String[] args) {
//        Employee emp1 = new Employee("Mia", LocalDate.of(2002, 02, 22));
//        Employee emp2 = new Employee("Keertika", LocalDate.of(2012, 07, 12));
//        System.out.println(emp1.getEmployeeInfo());
//        System.out.println(emp2.getEmployeeInfo());
//        System.out.println("\nTotal working years of " + emp1.getName() + " is " + emp1.computeNumberOfYearsWorkedSinceHired() + " years");
//        System.out.println("Total working years of " + emp2.getName() + " is " + emp2.computeNumberOfYearsWorkedSinceHired() + " years");
//    }


    //output for Part2
    public static void main(String[] args) {

        Department dept = new Department();
        Employee salEmp1 =new SalariedEmployee("teena", LocalDate.of(2002,
                05,9));
        Employee salEmp2 = new SalariedEmployee("sara", LocalDate.of(2012,
                02,12));
        Employee hourEmp = new HourlyEmployee("gretchen", LocalDate.of(2011,
                01,24));
        System.out.println(salEmp1.work());
        System.out.println(salEmp2.work());
        System.out.println(hourEmp.work());

        dept.addEmployee(salEmp1);
        dept.addEmployee(salEmp2);
        dept.addEmployee(hourEmp);
        System.out.println("Number of employee worked: "
                + dept.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());

        //Part-3 output
        //System.out.println(dept.computeDepartmentMonthlyTotalCompensation());

}
}