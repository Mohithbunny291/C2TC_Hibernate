package com.cg.C2TCTableJoinedInheritence;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee{

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
