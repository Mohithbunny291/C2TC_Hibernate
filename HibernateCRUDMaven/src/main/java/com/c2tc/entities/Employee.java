package com.c2tc.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "employee_table")
@DynamicUpdate
public class Employee {
	
	@Id
	@Column(name = "Employee_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	
	@Column(name = "Employee_Name")
	private String employeeName;
	
	@Column(name = "Email_Address")
	private String email;
	
	@Column(name = "Date_of_Join")
	private Date dojDate;
	
	@Column(name = "Salary")
	private Double salary;
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDojDate() {
		return dojDate;
	}
	public void setDojDate(Date dojDate) {
		this.dojDate = dojDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employeeName=" + employeeName + ", email=" + email
				+ ", dojDate=" + dojDate + ", salary=" + salary + "]";
	}
	
}
