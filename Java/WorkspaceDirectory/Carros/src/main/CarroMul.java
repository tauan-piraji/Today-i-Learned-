package main;

public class CarroMul extends CarroCorrida {
	private double potencia;

	public CarroMul(String nome, double potencia, int velocidadeMax) {
		super(nome, velocidadeMax);
		if (potencia > 1 && potencia < 2) {
			this.potencia = potencia;
		} else {
			this.potencia = 1.5;
		}
	}

	@Override
	public void acelerar() {
		if (velocidade == 0) {
			velocidade = 10;
		} else {
			velocidade *= potencia;
			if (velocidade > velocidadeMax) {
				velocidade = velocidadeMax;
			}
		}
	}

}