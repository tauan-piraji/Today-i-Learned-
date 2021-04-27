package main;

public class ContaEspecial extends ContaCorrente{
	int limite;
	
	ContaEspecial(int valorLimite){
		this.limite=valorLimite; 
	}

	public int sacar(int valor) {
		if(valor<=(saldo+limite)){
			saldo -= valor;
			return valor;
		}else {
			System.out.println("Valor superior ao saldo!!");
			return 0;
		}
	}
}