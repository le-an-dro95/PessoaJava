package br.ufpa.cbcc.pessoa;

public interface Autenticar{

	public void autenticacao();
	
	public void autenticacao(String usuario, String senha);
	
	public boolean validar();
	
}
