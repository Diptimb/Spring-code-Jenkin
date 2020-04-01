package com.example.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repository.DepartmentRepo;
import com.example.demo.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Override
	public Set<Employee> getAllEmployee(){
		List<Employee> employees=this.employeeRepo.findAll();//returns from database
		Set<Employee> employeeSet=new HashSet<>(employees);
		return employeeSet;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Department department = departmentRepo.findByDepartmentName("it").get(0);
		employee.setDepartment(department);
		Employee savedEmployee = this.employeeRepo.save(employee);

		return savedEmployee;
	}
	public Department saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		Department department=new Department(); 
		department.setDepartmentName(dept.getDepartmentName());
				departmentRepo.save(department);

		return department;
	}
}
