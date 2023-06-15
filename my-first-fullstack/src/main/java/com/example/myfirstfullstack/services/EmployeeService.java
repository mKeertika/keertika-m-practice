package com.example.myfirstfullstack.services;

import com.example.myfirstfullstack.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    Employee getEmployeeByName(String name);

    boolean deleteEmployeeById(long id);
}
