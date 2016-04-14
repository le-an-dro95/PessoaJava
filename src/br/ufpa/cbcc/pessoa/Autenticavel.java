package br.ufpa.cbcc.pessoa;

public interface Autenticavel{

	public void dadosParaAutenticacao();
	
	public void dadosParaAutenticacao(String usuario, String senha);
	
	public boolean validar();
	
}
