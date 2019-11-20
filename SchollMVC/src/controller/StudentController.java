package controller;

import model.Matter;
import model.Students;
import view.StudentView;

public class StudentController {
	
	private Students student;
	private StudentView view;
	
	public StudentController(Students student, StudentView view) {
		this.view = view;
		this.student = student;
	}
	
	public void notifyView() {
		view.showStudent(student);
	}
	
	public void setIdade(int idade) {
		student.setIdade(idade);
	}
	public void setName(String name) {
		student.setName(name);
	}
	public void setRegistration(String registration) {
		student.setRegistration(registration);
	}

}
