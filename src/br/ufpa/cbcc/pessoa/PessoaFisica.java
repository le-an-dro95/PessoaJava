package br.ufpa.cbcc.pessoa;

public abstract class PessoaFisica extends Pessoa {
	
	private String cpf;
	
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
