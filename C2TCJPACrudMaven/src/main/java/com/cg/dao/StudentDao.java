package com.cg.dao;

import com.cg.entity.Student;

public interface StudentDao {
	
	public abstract void addStudent(Student student);    //C
	public abstract Student getStudentById(int id);      //R
	public abstract void updateStudent(Student student); //U
	public abstract void deleteStudent(Student student); //D
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
