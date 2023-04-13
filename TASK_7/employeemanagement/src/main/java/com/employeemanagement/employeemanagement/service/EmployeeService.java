package com.employeemanagement.employeemanagement.service;

import java.util.List;

import com.employeemanagement.employeemanagement.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
