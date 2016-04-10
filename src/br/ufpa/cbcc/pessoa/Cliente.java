package br.ufpa.cbcc.pessoa;

public final class Cliente extends PessoaFisica {

	private String login;
	private String senha;
	
	public Cliente()
	{
	    login = "NomeUsuario";
	    senha = "0L@#";
	}

	public Cliente(String login, String senha)
	{
	    this.login=login;
	    this.senha=senha;
	}
	
	public void autenticar()
	{
	    System.out.println("Login: ");
	    login = ler.next();
	    System.out.println("Senha: ");
	    senha = ler.next();
	}

	public String getLogin()
	{
	    return login;
	}

	public String getSenha()
	{
	    return senha;
	}

	public void apresentarMenu()
	{
		System.out.println("     :: MENU ::\n\n");
		System.out.println("1 - Visualizar dados\n");
		System.out.println("2 - Emprestar Livro\n");
		System.out.println("3 - Devolver Livro\n");
		System.out.println("4 - Lista de livros emprestado pelo usuario\n");
		System.out.println("5 - Menu Principal\n");
		System.out.println("\n");
	}	
	
}
