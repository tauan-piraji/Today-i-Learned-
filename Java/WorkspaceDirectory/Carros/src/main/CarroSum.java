package main;

public class CarroSum extends CarroCorrida{
	private int potencia;
	
	public CarroSum(String nome, int potencia, int velocidadeMax){
		super(nome, velocidadeMax);
		this.potencia = potencia;
	}
	
	@Override
	public void acelerar() {
		velocidade += potencia;
		if(velocidade>velocidadeMax)
			velocidade=velocidadeMax;
	}
	
}
