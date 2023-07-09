package com.cg.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "t_student")
public class Student implements Serializable{
	
	private static final long serialVersionUID=1L;
	@Id
	private int studentById;
	private String studentName;
	private String studentTech;
	

	public int getStudentById() {
		return studentById;
	}



	public void setStudentById(int studentById) {
		this.studentById = studentById;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getStudentTech() {
		return studentTech;
	}



	public void setStudentTech(String studentTech) {
		this.studentTech = studentTech;
	}



	@Override
	public String toString() {
		return "Student [studentById=" + studentById + ", studentName=" + studentName + ", studentTech=" + studentTech
				+ "]";
	}
	
	
}
