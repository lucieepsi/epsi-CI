package com.epsi.epsiCI.repositories;

import com.epsi.epsiCI.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
