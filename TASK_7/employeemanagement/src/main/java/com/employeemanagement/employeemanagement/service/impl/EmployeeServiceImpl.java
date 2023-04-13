package com.employeemanagement.employeemanagement.service.impl;

import org.springframework.stereotype.Service;

import com.employeemanagement.employeemanagement.model.Employee;
import com.employeemanagement.employeemanagement.repository.EmployeeRepository;
import com.employeemanagement.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;
    
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        super();
        this.employeeRepository = employeeRepository;
    }
    
    
    
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);    
    }
     
}
