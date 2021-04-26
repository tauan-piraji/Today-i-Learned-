package main;

public class Principal {

	public static void main(String[] args) {
		Carro c1= new Carro();
		c1.potencia=10;
		c1.velocidade=0;
		c1.nome="Corcel";
		
		Carro c2= new Carro();
		c2.potencia=15;
		c2.velocidade=0;
		c2.nome="Fox";
		
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		c1.imprimir();
		
		c2.acelerar();
		c2.frear();
		c2.imprimir();
	}

}
