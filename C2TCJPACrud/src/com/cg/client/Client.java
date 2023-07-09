package com.cg.client;

import java.util.Scanner;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	private static Student student;
	private static StudentService service;
	static Scanner sc;

	public static void main(String[] args) {

		student = new Student();
		service = new StudentServiceImpl();

		sc = new Scanner(System.in);

		System.out.println(
				"Select \n 1. To Create/Persist data \n 2. To Find/Retrive data \n 3. To Update/Merge data  Id \n 4. To Delete/Remove data  Id");
		int n = sc.nextInt();
		
		switch(n) {
			case 1: {
				System.out.println("Enter your NEW ID");
				int id=sc.nextInt(); // id input
				sc.nextLine();
				
				System.out.println("Enter the name for your ID number: "+id);
				String name=sc.nextLine(); // name input
				
				System.out.println("Enter Tech");
				String tech = sc.nextLine();
				
				addStudent(id,name,tech); // feeding to local method for legibility
				
				System.out.println("Name \""+name+ "\" has been added to ID: "+id+"\n");
				main(new String[0]);
				break;
			}
			case 2: {
				System.out.println("Enter the ID you want to RETRIEVE information of");
				int id=sc.nextInt(); // id input
				sc.nextLine();
				
				Student s;
				try {
					s = service.getStudentById(id); // getting the Student info in variable s
					System.out.println("Information for Student ID "+ s +" is: "+s.getStudentName()+"\n");
				} catch (Exception e) {
					System.out.println("The ID does not exist in the database"+"\n");
				}
				
				main(new String[0]);
				break;
			}
			case 3: {
				System.out.println("Enter the ID whose Information you want to update.");
				int id=sc.nextInt(); // id input
				sc.nextLine();
		
				try {
					Student s=service.getStudentById(id); // getting the Student info in variable s
					
					System.out.println("Enter the name for your ID number: "+id);
					String name=sc.nextLine(); // change name input
					
					s.setStudentName(name); // changing name
					service.updateStudent(s); // sending update to database
					
				} catch (Exception e) {
					System.out.println("The ID does not exist in the database"+"\n");
				}
				
				main(new String[0]);
				break;
			}
			case 4:{
				System.out.println("Enter the ID you want to delete.");
				int id=sc.nextInt(); // id input
				sc.nextLine();
				
				try {
				Student s=service.getStudentById(id); // getting the Student info in variable s
				
				service.deleteStudent(s); // Deleting the info wrt. ID
				System.out.println("ID number "+id+" has been deleted"+"\n");
				
				}catch(Exception e) {
					System.out.println("The ID does not exist in the database"+"\n");
				}
				
				
				main(new String[0]);
				break;
			}
			default:
				break;
	
		}
	}

	private static void addStudent(int id, String name, String tech) {
		student.setStudentById(id);
		student.setStudentName(name);
		student.setStudentTech(tech);
		service.addStudent(student);
	}

}
