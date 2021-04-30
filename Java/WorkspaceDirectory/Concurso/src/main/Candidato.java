package main;

public class Candidato implements Comparable<Candidato>{
	private int nota;
	private int idade;
	private boolean deficiente;
	String def;
	
	public Candidato(int nota, int idade, boolean deficiente) {
		this.nota = nota;
		this.idade=idade;
		this.deficiente=deficiente;
	}
	
	public int getNota() {
		return nota;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public boolean isDeficiente() {
		return deficiente;
	}
	
	@Override
	public int compareTo(Candidato outro) {
		if(nota == outro.getNota()) {
			if(deficiente == outro.isDeficiente()) {
				return idade - outro.getIdade();
			}else {
				if(deficiente) {
					return 1;
				}else {
					return -1;
				}
			}
		}else {
			return nota- outro.getNota();
		}
		
	}
	
	@Override
	public String toString() {
		if(isDeficiente()==true) {
			this.def = "deficiente";
		}else {
			this.def = "não é deficiente";
		}
		return nota+";"+ def+";"+ getIdade();
	}
	
}
