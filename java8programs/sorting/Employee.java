package com.test.java8programs.sorting;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private int departmentId;
	
	public Employee(int id, String name, int salary, int departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", departmentId=" + departmentId + "]";
	}
	
}
