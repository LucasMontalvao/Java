package main;

import controller.StudentController;
import model.Students;
import view.StudentView;

public class Main {

	public static void main(String[] args) {
		Students student = new Students("Lucas", 20, "1144002811");
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(student, view);
		
		controller.notifyView();
		controller.setName("Vão estudar seus corno");
		controller.notifyView();
		
	}
}
