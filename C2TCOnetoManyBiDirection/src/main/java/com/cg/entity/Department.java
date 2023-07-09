package com.cg.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department_table")
public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "department_Id")
	private int department_Id;
	
	@Column(name = "department_Name")
	private String departmentName;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private Set<Employee> employee = new HashSet<>();

	public int getDepartmentId() {
		return department_Id;
	}

	public void setDepartmentId(int department_Id) {
		this.department_Id = department_Id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	//d1.addEmployee(e1);
	public void addEmployee(Employee employee) {
		
		employee.setDepartment(this);
		this.getEmployee().add(employee);
	}
	
}
