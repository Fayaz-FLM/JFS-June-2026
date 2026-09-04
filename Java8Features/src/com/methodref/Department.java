package com.methodref;

public class Department {

	String departmentName;

	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public Department() {
		super();
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + "]";
	}
	
	
}
