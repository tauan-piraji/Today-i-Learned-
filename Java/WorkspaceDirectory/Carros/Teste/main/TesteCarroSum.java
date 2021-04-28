package main;
import static org.junit.Assert.*;

import org.junit.*;

public class TesteCarroSum{
	CarroCorrida c;
	
	@Before
	public void criaCarro(){
		c = new CarroSum("Teste", 20, 120);
	}
	
	@Test
	public void testNome() {
		assertEquals("Teste", c.getNome());
	}
	
	@Test
	public void testCarroParado() {
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerar() {
		c.acelerar();
		assertEquals(20, c.getVelocidade());
	}
	
	@Test
	public void testFrear() {
		c.acelerar();
		c.frear();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	public void testFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testVelocidadeMax() {
		for(int i=0;i<15;i++)
			c.acelerar();
		assertEquals(120, c.getVelocidade());
	}
	
}
