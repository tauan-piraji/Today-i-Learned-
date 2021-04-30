package main;

public class Principal {

	public static void main(String[] args) {
		Pilha p= new Pilha(10);
		p.empilhar("eduardo");
		p.empilhar("tauan");
		p.empilhar("Licy");
		System.out.println(p.topo());
		System.out.println(p.getTopo());
	}

}
 