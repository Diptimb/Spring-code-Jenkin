package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
//T=entity name
	//Integer=type of primary key
	public Employee getByName(String name);
}