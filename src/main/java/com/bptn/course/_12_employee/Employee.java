package com.bptn.course._12_employee;

public class Employee {
	
	private int salary;
	private int hoursPerDay;
	
	//constructor
	
	public Employee(int salary, int hoursPerDay) {
		//call the setter methods so that the logic of salary increase applies when creating new object
		setSalary(salary);
		setHoursPerDay(hoursPerDay);
	}
	
	
	public void setSalary(int salary) {
		if(salary < 500) {
			this.salary = salary + 10;
		} else {
			this.salary = salary;	
		}
	}
	
	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
		if(hoursPerDay > 6) {
			this.salary += 5;
		}
	}
	
	int getSalary() {
		return salary;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(100, 8);
        
        // Print the salary of the employee
        System.out.println("The salary of the employee is: " + employee.getSalary());

	}

}
