package view;

import model.Matter;
import model.Students;

public class StudentView {
	
	public void showStudent(Students student) {
		System.out.println("| Idade do aluno: " + student.getIdade());
		System.out.println("| Nome do aluno: " + student.getName());
		System.out.println("| Matricula do aluno: " + student.getRegistration());
		System.out.println("--------------------------------------");
		for(Matter average: student.getMatter()) {
			System.out.println("| Materia: " + average.getName() + "\n" + "| Media:" + average.getNota());
			System.out.println("--------------------------------------");
		} 
	}
}
