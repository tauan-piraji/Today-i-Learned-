package main;

public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException{
		if(login.equals("Guerra") && senha.equals("123456")) {
			return new Usuario(login);
		}
		throw new LoginException("O usuario e a senha não batem", login);
	}
	
}