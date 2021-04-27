package main;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.*;

public class ContaCorrenteTest {
	
	ContaCorrente cc;

	@Before
	public void criarConta() {
		cc = new ContaCorrente();
		cc.saldo = 990;
		assertEquals(990, cc.saldo);
	}
	
	@Test
	public void testandoSacarValorMaior() {
		int valorSacado = cc.sacar(1000);
		assertEquals(990, cc.saldo);
		assertEquals(0, valorSacado);
	}
	
	@Test
	public void testandoSacarValorMenor() {
		int valorSacado = cc.sacar(450);
		assertEquals(540, cc.saldo);
		assertEquals(450, valorSacado);
	}
	
	@Test
	public void testaDeposito() {
		cc.depositar(800);
		assertEquals(1790, cc.saldo);
	}
}
