package br.ufpa.cbcc.pessoa;

public final class Funcionario extends PessoaFisica implements InfFuncionario, AutenticarFuncionario {
	
	private String idFuncionario;
	private String senha;
	private String senhaMestra;
	private String cargo;
	private String funcao;

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
	
	@Override
	public void informarCargo()
	{
		System.out.println("Digite o Cargo: ");
		cargo = ler.nextLine();
	}
	
	@Override
	public void informarFuncao()
	{
		System.out.println("Digite a funcao: ");
		funcao = ler.nextLine();
	}
	
	@Override
	public void autenticacao(String usuario, String senha, String senhaMestra)
	{
		this.idFuncionario=usuario;
		this.senha=senha;
	    this.senhaMestra=senhaMestra;
	}
	
	@Override
	public void autenticacao(String usuario, String senha)
	{
		this.idFuncionario=usuario;
		this.senha=senha;
	}
	
	@Override
	public boolean validarMestra()
	{
		 if (idFuncionario == "123" && senha == "123" && senhaMestra == "123")
		        return true;
			return false;
	}
	
	@Override
	public boolean validar()
	{
		if (idFuncionario == "123" && senha == "123")
	        return true;
		return false;
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
