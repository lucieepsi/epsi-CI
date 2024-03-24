package com.epsi.epsiCI.services.impls;

import com.epsi.epsiCI.entities.Employee;
import com.epsi.epsiCI.repositories.EmployeeRepository;
import com.epsi.epsiCI.services.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

}
