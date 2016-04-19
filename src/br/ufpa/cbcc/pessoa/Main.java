package br.ufpa.cbcc.pessoa;

public class Main {

	public static void main(String[] args) {
		
		Cliente gente = new Cliente();
		gente.dadosParaAutenticacao();//Pessoa
		gente.dadosParaAutenticacao("Usuario1", "SenhadoUsuario");//PessoaFisica
		
		gente.validar();//PessoaFisica
		
		//new Pessoa.validar();
	}

}
