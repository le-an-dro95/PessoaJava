package br.ufpa.cbcc.pessoa;

public class Data {
	
	private int dia, mes, ano;
	
	public Data(int dia, int mes, int ano)
	{
	    this.mes = mes;
	    this.ano = ano;     
	    this.dia = checarDia(dia);
	}

	public void setData(int dia, int mes, int ano)
	{
	    this.mes = mes;
	    this.ano = ano;
	    this.dia = checarDia(dia);
	}

	public int getDia()
	{
	    return this.dia;
	}

	public int getMes()
	{
	    return this.mes;
	}

	public int getAno()
	{
	    return this.ano;
	}

	public int checarDia(int dia)
	{
	    final int diasPorMes [] = {0, 31, 28, 31, 30, 30, 31, 31, 30, 31, 30, 31};
	    
	    if(dia > 0 && dia <= diasPorMes[mes])
	        return dia;
	    
	    if (mes == 2 && dia == 29 && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)))
	        return dia;
	    
	    System.out.println("\nDia invalido\n");
	    System.out.println("Digite novamente: \n\n");
	    return dia=-9999;
	}
}
