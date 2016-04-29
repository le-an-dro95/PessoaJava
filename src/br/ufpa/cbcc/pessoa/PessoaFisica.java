package br.ufpa.cbcc.pessoa;

public abstract class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String usuario, senha;
	
	
	public abstract void apresentarMenu();
	public abstract void autenticar();
	public abstract String getSenha();
	
	public PessoaFisica()
	{
		super();
	    this.cpf="000.000.000-00";
	}

	public PessoaFisica(String nome, int idade, String genero, String cpf)
	{
		super(nome, idade, genero);
	    this.cpf = cpf;
	}
	
	public PessoaFisica(PessoaFisica p)
	{
		super(p);
		cpf = p.cpf;
	}
	
	@Override
	public void dadosParaAutenticacao(String usuario, String senha)
	{
		this.usuario=usuario;
		this.senha=senha;
		System.out.println("Usou o autenticacao() implementado no PessoaFisica");
	}
	
	@Override
	public boolean validar()
	{
		System.out.println("Sobrescreveu metodo validar no PessoaFisica");
		if (usuario == "123" && senha == "123" 
			&& cpf == "001002003-11")
			return true;
		else return false;
	}
	
	public String getCpf()
	{
	    return cpf;
	}

	public void setCpf()
	{
	    System.out.println("CPF: ");
	    cpf = ler.next();
	}
}
