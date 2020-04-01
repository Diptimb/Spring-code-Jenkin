package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "salarry")
	private double salarry;
	@ManyToOne
	@JsonIgnore
	private Department department;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salarry=" + salarry + ", department=" + department + "]";
	}

	public Employee(int id, String name, double salarry, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salarry = salarry;
		this.department = department;
	}

	public Employee(String name, double salarry, Department department) {
		super();
		this.name = name;
		this.salarry = salarry;
		this.department = department;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalarry() {
		return salarry;
	}

	public void setSalarry(double salarry) {
		this.salarry = salarry;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
