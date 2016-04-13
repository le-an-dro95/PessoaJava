package br.ufpa.cbcc.pessoa;

public abstract class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String usuario, senha;
	
	public abstract void apresentarMenu();
	public abstract void autenticar();
	public abstract String getSenha();
	
	public PessoaFisica()
	{
	    this.cpf="000.000.000-00";
	}

	public PessoaFisica(String cpf)
	{
	    this.cpf = cpf;
	}
	
	@Override
	public void autenticacao(String usuario, String senha)
	{
		this.usuario=usuario;
		this.senha=senha;
	}
	
	@Override
	public boolean validar()
	{
		if (usuario == "123" && senha == "123" && cpf == "001002003-11")
			return true;
		else 
			return false;
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
