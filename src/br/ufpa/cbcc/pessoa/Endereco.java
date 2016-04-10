package br.ufpa.cbcc.pessoa;

public class Endereco {
	
	private int n;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(String rua, int n, String bairro, String cidade, String estado)
	{
	    this.rua = rua;
	    this.n = n;
	    this.bairro = bairro;
	    this.cidade = cidade;
	    this.estado = estado;
	}

	public void setEndereco(String rua, int n, String bairro, String cidade, String estado)
	{
	    this.rua = rua;
	    this.n = n;
	    this.bairro = bairro;
	    this.cidade = cidade;
	    this.estado = estado;
	}

	public void getEndereco()
	{
	    System.out.println("\nEndereco: \n");
	    System.out.println("Rua: "+rua+" n: "+n+"\n");
	    System.out.println("Bairro: "+bairro+"\n");
	    System.out.println("Cidade: "+cidade+"\n");
	    System.out.println("Estado: "+estado+"\n");
	}
}
