package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	
	private String deptName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private List<Student> student;
	
	public Department() {
		
	}
	
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}

	public Department(String deptName, List<Student> student) {
		super();
		this.deptName = deptName;
		this.student = student;
	}

	public Department(int deptId, String deptName, List<Student> student) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.student = student;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
