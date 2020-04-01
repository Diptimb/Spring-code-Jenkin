package com.example.demo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class HomeController {
	@Autowired
	private EmployeeService employeeService;
	

	@GetMapping("/home")
	public String getHome() {
		return "Hello";
	}

	@GetMapping("/home/our")
	public String getchoice() {
		return "Welcome to springboot";
	}

	@GetMapping("/get/all/employee")
	public Set<Employee> getEmployee() {
		System.out.println("hihi");
		Set<Employee> employees = this.employeeService.getAllEmployee();
		System.out.println(employees.toString());
		return employees;
	}

	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return this.employeeService.saveEmployee(employee);
	}
	@PostMapping("/save/department")
	public Department saveDept(@RequestBody Department dept) {
		return this.employeeService.saveDepartment(dept);
	}
}
