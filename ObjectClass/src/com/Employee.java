package com;

public class Employee implements Cloneable {
	
	private int empId;
	
	private String name;
	
	private double salary;
	
	private Address address;
	
	public Employee() {
		
	}

	public Employee(int empId, String name, double salary, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee(Employee emp) {
		
		this.empId = emp.empId;
		this.name = emp.name;
		this.salary = emp.salary;
		this.address = new Address(emp.address);
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Employee(this);
	}
}
