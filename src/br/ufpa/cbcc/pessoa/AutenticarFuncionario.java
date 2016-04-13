package br.ufpa.cbcc.pessoa;

public interface AutenticarFuncionario{

	public void autenticacao(String usuario, String senha, String senhaMestra);
	
	public void autenticacao(String usuario, String senha);
	
	public boolean validarMestra();
	
	public boolean validar();
	
}
