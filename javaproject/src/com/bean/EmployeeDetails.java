package com.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetails {
	ArrayList<Employee> employeelist = new ArrayList<>();

	public void addEmployee(Employee employee) {
		employeelist.add(employee);
	}

	public void removeEmployee(int id, String name) {
		for (Iterator iterator = employeelist.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if ((employee.getId() == id) || (employee.getName().equals(name))) {
				iterator.remove();
			}
		}
	}

	public void showEmployee() {
		for (Employee employee1 : employeelist) {
			System.out.println("Employee ID : " + employee1.getId() + " Employee Name : " + employee1.getName()
					+ " Employee Salary : " + employee1.getSalary() + " Employees Cabin : " + employee1.getCabin());
		}
	}

	public void searchEmployeeByCabin(String cabin) {
		for (Employee employee2 : employeelist) {
			if (employee2.getCabin().equalsIgnoreCase(cabin))
				System.out.println("Employee Name :" + employee2.getName() + " Employee ID : " + employee2.getId()
						+ " Employee Salary : " + employee2.getSalary() + " Employees Cabin : " + employee2.getCabin());
		}
	}

	public void searchEmployeeByName(String name) {
		for (Employee employee2 : employeelist) {
			if (employee2.getName().equals(name))
				System.out.println("Employee Name :" + employee2.getName() + " Employee ID : " + employee2.getId()
						+ " Employee Salary : " + employee2.getSalary() + " Employees Cabin : " + employee2.getCabin());
		}
	}

	public Employee getHighestSalary() {
		Employee maxValue = null;
		int maximum = 0;
		for (Employee employee : employeelist) {
			if (employee.getSalary() > maximum) {
				maximum = employee.getSalary();
				maxValue = employee;
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employees = new EmployeeDetails();
		Employee e1 = new Employee(1, "Nokia", 30000, "A");
		Employee e2 = new Employee(2, "Sony", 200000, "B");
		Employee e3 = new Employee(3, "Samsung", 25000, "C");
		employees.addEmployee(e1);
		employees.addEmployee(e2);
		employees.addEmployee(e3);
		System.out.println();
		employees.showEmployee();
		employees.removeEmployee(1, "acer");
		System.out.println();
		employees.searchEmployeeByCabin("B");
		employees.showEmployee();
		employees.searchEmployeeByName("Sony");
		System.out.println(employees.getHighestSalary().getName() + " " + employees.getHighestSalary().getId() + " "
				+ employees.getHighestSalary().getSalary() + " " + employees.getHighestSalary().getCabin());
	}
}