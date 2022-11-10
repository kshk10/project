package com.bean;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String cabin;

	public Employee(int id, String name, int salary, String cabin) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.cabin = cabin;
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

	public String getCabin() {
		return cabin;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
}