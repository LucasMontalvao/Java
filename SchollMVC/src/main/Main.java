package main;

import controller.StudentController;
import model.Matter;
import model.Students;
import view.StudentView;

public class Main {

	public static void main(String[] args) {
		Matter poo = new Matter("POO", 10);
		Matter sop = new Matter("SOP", 9);
		Matter math = new Matter("Matemática", 7);
		Students student = new Students("Lucas", 20, "1144002811");
		student.setNotas(math);
		student.setNotas(sop);
		student.setNotas(poo);
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(student, view);
		
		controller.notifyView();
		
	}
}
