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
