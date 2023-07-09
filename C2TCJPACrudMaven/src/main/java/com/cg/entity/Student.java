package com.cg.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "t_Student")
public class Student implements Serializable{
	
	private static final long serialVersionUID=1L;
	@Id
	private int StudentId;
	private String StudentName;
	private String StudentTech;
	
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getStudentTech() {
		return StudentTech;
	}

	public void setStudentTech(String studentTech) {
		StudentTech = studentTech;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentTech=" + StudentTech
				+ "]";
	}
	
}
