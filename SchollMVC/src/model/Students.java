package model;

public class Students {
	private String name;
	private int idade;
	private String registration;
	
	public Students() {}
	public Students(String name, int idade, String registration) {
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

}
