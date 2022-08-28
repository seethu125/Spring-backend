package com.api.employee.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
