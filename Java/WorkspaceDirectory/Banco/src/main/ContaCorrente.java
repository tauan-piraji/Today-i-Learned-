package main;

public class ContaCorrente {
	int saldo;
	
	public int sacar(int valor) {
		if(valor<=saldo){
			saldo -= valor;
			return valor;
		}else {
			System.out.println("Valor superior ao saldo!!");
			return 0;
		}
	}

	public void depositar(int valor) {
		saldo += valor;
	}
}