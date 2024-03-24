package com.epsi.epsiCI.services;

import com.epsi.epsiCI.entities.Employee;
import com.epsi.epsiCI.repositories.EmployeeRepository;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);
    ;
}
