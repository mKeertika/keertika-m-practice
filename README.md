# keertika-m-practice
for emp app
[“Employee” app development:  Part #1]
Concepts that are exercised
Classes, References, and Instantiation
Fields and Methods in a class
High-level steps to take
Write Employee class definition with some fields and methods
Write client code (class with main method) that creates and accesses object instances of Employee class
Concrete steps to take – Part 1
Create employee-app package
Create com.hr.personnel sub-package under employee-app package
Write Employee class under the com.hr.personnel package with the following fields
private String name;
private LocalDate hireDate;
Add the following methods to the Employee class 
public String getEmployeeInfo() method which returns String type of something like “name = Mike, hireDate = 2020-02-03"
public String work() method that just returns String type of something like “Mike worked.”
Write HRClient class under com.hr.personnel package
Create “main(..)” method
Create two com.hr.personnel.Employee objects and call getEmployeeInfo() method of those objects
For creating “LocalDate” object, you can use “LocalDate.of(YYYY, MM, DD)”
Display the result in the console
Concrete steps to take – Part 2
Add another method below to the Employee class
Invoke this method and display the result in the “main(..)” method
    // If current year is 2022 and the year of hireDate is
    // 2020, it returns 2
    public int computeNumberOfYearsWorkedSinceHired() {

        // TODO: add code here
    }
(edited)

[“Employee” app development:  Part #2]
Concepts that are exercised
Composition
Inheritance
Java array
High-level steps to take
Write sub-classes of Employee class: 
SalariedEmployee
HourlyEmployee
Write Department class that contains an array of Employee objects
Concrete steps to take
Write SalariedEmployee and HourlyEmployee classes extending com.hr.personnel.Employee class
Add the following fields and appropriate accessor methods to the SalariedEmployee class
double monthlySalary;
Add the following fields and appropriate accessor methods to the HourlyEmployee class
Int hoursWorkedPerMonth;
double hourlyRate;
Refactor HRClient class
Create two SalariedEmployee objects and one HourlyEmployee object replacing Employee objects
Write Department class under the com.hr.personnel package with the following fields:
String name
String location
Employee[] employees = new Employee[100];
int currentIndex = 0; // indicates the empty array slot to use for adding an Employee object
Implement the following methods to the Department class
void addEmployee(Employee employee)
int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked()
One way you can check if an Employee worked or not is by checking the returned value of the work() method of an Employee object - if it contains “worked” string, you can consider that employee indeed worked.
Change HRClient class to use Department class
Add Employee objects (actually SalariedEmployee and HourlyEmployee objects) to the Department object
Invoke letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() method of the Department object and display the result

[“Employee” app - Part #3: Polymorphism]
Concepts that are exercised
Overriding methods and Polymorphism
High-level steps to take
Add different behavior to sub-classes, in other words, the sub-classes override methods of a parent class
Observe polymorphic behavior of Java
Concrete steps to take
Add the following method to the Employee class 
public double computeMonthlyCompensation() { 
       
   return 0.0; 
} 
4. Implement computeMonthlyCompensation() method in the SalariedEmployee class overriding the one of the parent Employee class
The computeMonthlyCompensation() method just returns the value of the monthlySalary field
5. Implement computeMonthlyCompensation() method in the HourlyEmployee class overriding the one of the parent Employee class
The computeMonthlyCompensation() method return the value of “hourlyRate * hoursWorkedPerMonth”
6. Implement the following method to the Department class
// Compute total monthly compensation of all   
// employees in that department 
     
public double computeDepartmentMonthlyTotalCompensation(){ 
         
    // TODO: add code here 
    return 0.0; 
} 
7. Add code in the HRClient class to display the result of calling computeDepartmentMonthlyTotalCompensation() method of the Department object
Refactor HRClient class to create SalariedEmployee and HourlyEmployee objects with monthlySalary as a constructor argument for the SalariedEmployee object and hourlyRate and hoursWorkedPerMonth as constructor arguments for the HourlyEmployee objects (if you have not done so yet)
8. Optional exercise (do this only if you have extra time)
Add CommissionedEmployee sub-class with the following fields
private double commissionRate;
private double[] monthlySales;
Implement computeMonthlyCompensation() method for the CommissionedEmployee as following:
The monthly compensation for the CommissionedEmployee is total of “commissionRate * <each-sale-amount>”
