package model;

import java.util.ArrayList;
import java.util.List;

public class Students {
	private String name;
	private int idade;
	private String registration;
	private List<Matter> materias;
	
	public Students() {
		materias = new ArrayList<>();
	}
	public Students(String name, int idade, String registration) {
		materias = new ArrayList<>();
		setName(name);
		setIdade(idade);
		setRegistration(registration);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public void setNotas(Matter matter) {
		materias.add(matter);
	}
	public List<Matter> getMatter() {
		return materias;
	}
}
