
package main;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestCarroMul {

	CarroMul c;
	
	@Before
	public void criarCarro() {
		 c = new CarroMul("BMW", 1.7, 250);
	}
	
	@Test
	public void testNome() {
		assertEquals("BMW", c.getNome());
	}
	
	@Test
	public void testCarroParado() {
		assertEquals(0, c.getVelocidade());
	}	 
	 
	@Test
	public void testAceleracao() {
		for(int i=0; i<8; i++){
			c.acelerar();
		}
		assertEquals(250, c.getVelocidade());
	}
}
