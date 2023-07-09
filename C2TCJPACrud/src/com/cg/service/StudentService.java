package com.cg.service;

import com.cg.entity.Student;

public interface StudentService {

	public abstract void addStudent(Student student);    //C
	public abstract Student getStudentById(int id);      //R
	public abstract void updateStudent(Student student); //U
	public abstract void deleteStudent(Student student); //D
}
