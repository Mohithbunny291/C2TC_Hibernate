package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	private static EntityManager manager;
	
	public StudentDaoImpl() {
		manager = JPAUtil.getEntityManager();
	}

	//CREATE
	@Override
	public void addStudent(Student student) {
		manager.persist(student);
	}

	//RETRIVE
	@Override
	public Student getStudentById(int id) {
		Student student = manager.find(Student.class, id);
		return student;
	}

	//UPDATE
	@Override
	public void updateStudent(Student student) {
		manager.merge(student);		
	}

	//DELETE
	@Override
	public void deleteStudent(Student student) {
		manager.remove(student);
	}

	@Override
	public void beginTransaction() {
		manager.getTransaction().begin();
				
	}

	@Override
	public void commitTransaction() {
		manager.getTransaction().commit();
		
	}

}
