package br.ufpa.cbcc.pessoa;

public final class Funcionario extends PessoaFisica{
	
	private String idFuncionario;
	private String senha;
	private String senhaMestra;

	public Funcionario()
	{
	    idFuncionario = "NomeUsuario";
	    senha = "0L@#";
	}

	public Funcionario(String idFuncionario, String senha, String senhaMestra)
	{
	    this.idFuncionario=idFuncionario;
	    this.senha=senha;
	    this.senhaMestra=senhaMestra;
	}
	
	public void autenticar()
	{
	    System.out.println("ID Funcionario: ");
	    idFuncionario = ler.next();
	    System.out.println("Senha Mestra: ");
	    senhaMestra = ler.next();
	    System.out.println("Senha: ");
	    senha = ler.next();
	}

	public boolean liberaAcesso()
	{
	    if (idFuncionario == "123" && senha == "123" && senhaMestra == "123")
	        return true;
		return false;
	}

	public String getLogin()
	{
	    return idFuncionario;
	}

	public String getSenha()
	{
	    return senha;
	}

	public void apresentarMenu()
	{
	    //system("cls");
	    System.out.println(":: MENU ::\n\n");
	    System.out.println("1 - Cadastrar Usuario\n");
	    System.out.println("2 - Consultar Usuarios\n");
	    System.out.println("3 - Cadastrar Livro\n");
	    System.out.println("4 - Cadastrar Funcionario\n");
	    System.out.println("5 - SAIR\n");
	}
}
