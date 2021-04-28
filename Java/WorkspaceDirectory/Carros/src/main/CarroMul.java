package main;

public class CarroMul extends CarroCorrida {
	private double potencia;
	private double velocidade;
	
	public CarroMul(String nome, double potencia, int velocidadeMax, double velocidade) {
		super(nome, velocidadeMax);
		if(potencia > 1 && potencia < 2) {
			this.potencia = potencia;
		}else {
			this.potencia = 1.5;
		}
	}

	@Override
	public void acelerar() {
		if(velocidade == 0) {
			velocidade = 1;
		}else {
			if(velocidade > velocidadeMax) {
				velocidade = velocidadeMax;
			}else {
				velocidade *= potencia;
			}
		}
	}

}