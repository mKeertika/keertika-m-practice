package com.example.myfirstfullstack.controller;

import com.example.myfirstfullstack.models.Employee;
import com.example.myfirstfullstack.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestEmployeeController {

    private EmployeeService employeeService;

    public RestEmployeeController() {
    }

    @Autowired
    public RestEmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        return employeeList;
   }
//
//    @GetMapping("/showNewEmployeeForm")
//    public Employee showNewEmployeeForm() {
//        // create model attribute to bind form data
//        Employee employee = new Employee();
//        return employee;
//    }
//
//    @PostMapping("/saveEmployee")
//    public String saveEmployee(@RequestBody @Valid Employee employee,
//                               BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "employee/new_employee";
//        }
//
//        // save employee to database
//        employeeService.saveEmployee(employee);
//        return "redirect:/";
//    }
//
//    @GetMapping("/showFormForUpdate/{id}")
//    public String showFormForUpdate(@PathVariable(value = "id") long id) {
//
//        // get employee from the service
//        Employee employee = employeeService.getEmployeeById(id);
//
//        // set employee as a model attribute to pre-populate the form
//        Employee employee1 = employee;
//        return "employee/update_employee";
//    }
//
//    @GetMapping("/deleteEmployee/{id}")
//    public String deleteEmployee(@PathVariable(value = "id") long id) {
//
//        // call delete employee method
//        this.employeeService.deleteEmployeeById(id);
//        return "redirect:/";
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @GetMapping("/logout")
//    public String logout(HttpServletRequest request){
//        HttpSession httpSession = request.getSession();
//        httpSession.invalidate();
//        return "redirect:/";
//    }
}
