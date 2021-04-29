package main;

public class Principal {
	
	public static void main(String[] args) {
		Corrida corridaF1 = new Corrida(5000);
		corridaF1.adicionarCarro(new CarroSum("fox", 25, 140));
		corridaF1.adicionarCarro(new CarroSum("gol", 20, 160));
		corridaF1.adicionarCarro(new CarroMul("Bmw", 1.7, 220));
		corridaF1.adicionarCarro(new CarroMul("Ferrari", 1.4, 240));
		corridaF1.umDoisTresEJa();
	}

}
