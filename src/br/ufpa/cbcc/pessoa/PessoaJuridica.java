package br.ufpa.cbcc.pessoa;

public abstract class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	
	public PessoaJuridica()
	{
	    this.cnpj="00000000000";
	}

	public PessoaJuridica(String cnpj)
	{
	    this.cnpj = cnpj;
	}
	
	public String getCnpj()
	{
	    return cnpj;
	}

	public void setCnpj()
	{
	    System.out.println("CNPJ: ");
	    cnpj = ler.next();
	}
}