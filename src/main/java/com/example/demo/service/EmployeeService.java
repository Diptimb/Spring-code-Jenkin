package com.example.demo.service;

import java.util.Set;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;

public interface EmployeeService {
	Set<Employee> getAllEmployee();

	Employee saveEmployee(Employee employee);
	Department saveDepartment(Department dept) ;
}
