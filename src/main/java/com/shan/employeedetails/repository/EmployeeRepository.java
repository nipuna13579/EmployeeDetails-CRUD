package com.shan.employeedetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shan.employeedetails.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
