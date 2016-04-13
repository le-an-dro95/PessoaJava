package br.ufpa.cbcc.pessoa;

public class Main {

	public static void main(String[] args) {
		
		Cliente gente = new Cliente();
		gente.autenticacao();//Pessoa
		gente.autenticacao("Usuario1", "SenhadoUsuario");//PessoaFisica
		
		gente.validar();//PessoaFisica
		
		//new Pessoa.validar();
	}

}
