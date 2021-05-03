package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TesteAutentificador {
	
	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Guerra", "123456");
		assertEquals("Guerra", u.getLogin());
	}
	
	@Test(expected=LoginException.class)
	public void loginFalha() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("gura", "Senhaerrada");
	}
	
	@Test
	public void informacaoDoErro(){
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("Gurra", "Senhaerrada");
			fail();
		} catch (LoginException e) {
			assertEquals("Guerra", e.getLogin());
		}
	}

}