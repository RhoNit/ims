package com.springrest.inventoryManagement.springrest;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.inventoryManagement.springrest.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer > {

}
