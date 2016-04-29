package br.ufpa.cbcc.pessoa;

public abstract class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	
	public PessoaJuridica()
	{
		super();
	    this.cnpj="00000000000";
	}

	public PessoaJuridica(String nome, int idade, String genero, String cnpj)
	{
		super(nome, idade, genero);
	    this.cnpj = cnpj;
	}
	
	public PessoaJuridica(PessoaJuridica p)
	{
		super(p);
		cnpj = p.cnpj;
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