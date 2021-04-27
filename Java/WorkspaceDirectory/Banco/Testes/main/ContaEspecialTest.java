package main;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class ContaEspecialTest extends ContaCorrenteTest{

	@Before
	public void criarConta() {
		cc = new ContaEspecial(100);
		cc.saldo = 990;
		assertEquals(990, cc.saldo);
	}
	
	@Test
	public void testandoSacarValorNoLimite() {
		int valorSacado = cc.sacar(1000);
		assertEquals(-10, cc.saldo);
		assertEquals(1000, valorSacado);
	}
	
	@Test
	public void testandoSacarValorMaior() {
		int valorSacado = cc.sacar(1500);
		assertEquals(990, cc.saldo);
		assertEquals(0, valorSacado);
	}
	
}
