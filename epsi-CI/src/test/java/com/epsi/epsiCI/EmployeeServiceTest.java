package com.epsi.epsiCI;

import com.epsi.epsiCI.entities.Employee;
import com.epsi.epsiCI.repositories.EmployeeRepository;
import com.epsi.epsiCI.services.EmployeeService;
import com.epsi.epsiCI.services.impls.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class EmployeeServiceTest {
    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllEmployees() {
        // Arrange
        Employee employee1 = new Employee();
        employee1.setId(1L);
        employee1.setName("John");
        employee1.setRole("Developer");

        Employee employee2 = new Employee();
        employee2.setId(2L);
        employee2.setName("Jane");
        employee2.setRole("Tester");

        when(employeeRepository.findAll()).thenReturn(Arrays.asList(employee1, employee2));

        // Act
        List<Employee> employees = employeeService.getAllEmployees();

        // Assert
        assertEquals(2, employees.size());
    }
}
