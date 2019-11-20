package model;

public class Matter {
	private String name;
	private int nota;
	
	public Matter() {}
	public Matter(String name, int nota) {
		setName(name);
		setNota(nota);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
}
