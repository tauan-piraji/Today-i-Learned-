package main;
public class Somador{
	String nome;
	int ValorInstancia = 0;
	static int ValorIstatico = 0;
	
	void Somar(){
		ValorInstancia ++;
		ValorIstatico ++;
	}
	
	void imprimir() {
		System.out.println("O somar: " +nome+ "instancia="+ValorInstancia+ " Istatico="+ValorIstatico);
	}
}