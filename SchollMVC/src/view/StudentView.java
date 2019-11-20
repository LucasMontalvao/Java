package view;

import model.Students;

public class StudentView {
	
	public void showStudent(Students student) {
		System.out.println(student.getIdade());
		System.out.println(student.getName());
		System.out.println(student.getRegistration());
		System.out.println();
	}
}
