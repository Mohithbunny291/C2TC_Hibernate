package com.c2tc.JPAHibMavenClient;


import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;


public class Client {

	private static Student student;
	private static StudentService service;
	
	public static void main(String[] args) {
		
			student = new Student();
			
			service= new StudentServiceImpl();
			 
			student.setStudentId(91);
			student.setStudentName("Han");
			student.setStudentTech("pip");
			service.addStudent(student);
	}

}
