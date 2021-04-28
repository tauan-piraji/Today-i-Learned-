package main;

public abstract class CarroCorrida {

	protected int velocidade;
	protected int velocidadeMax;
	protected String nome;

	public CarroCorrida(String nome, int velocidadeMax){
		this.velocidade = 0;
		this.nome = nome;
		this.velocidadeMax = velocidadeMax;
	}
	
	public abstract void acelerar();
	
	public void frear() {
		velocidade = velocidade / 2; 
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}

}
