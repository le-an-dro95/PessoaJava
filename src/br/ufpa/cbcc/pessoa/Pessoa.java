package br.ufpa.cbcc.pessoa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.*;

public abstract class Pessoa implements InfEmprestimo{
	Scanner ler = new Scanner(System.in);
    private String nome;
    private int idade;
    private String genero; 
    private Data dataNascimento;
    private Endereco dadosEndereco;
    
    private int indexPessoa;
    private int qtdPessoas=0;
    private static int maxEmprestimo=3;
    private int qtddeLivros=0; 
    private String [] livroNomes;
    int diaEmprestimo;
	
    public abstract void apresentarMenu();
    
    public Pessoa()
    {
    	dataNascimento = new Data(01,01,1900);
    	dadosEndereco = new Endereco("Rua",0,"bairro","cidade","estado");
        this.nome= "nome";
        this.idade= 0;
        this.genero= "genero";
    }

    public Pessoa(String nome, int idade, String genero, int dia, int mes, int ano, String rua, int numero, String bairro, String cidade, String estado)
    {
    	dataNascimento = new Data(dia, mes, ano);
    	dadosEndereco = new Endereco(rua, numero, bairro, cidade, estado);  			
        this.nome = nome; 
        this.idade = idade;
        this.genero = genero;
    }
    
    @Override
    public void dataEmprestimo()
    {
    	int mes, ano;
       	System.out.println("Data de Hoje: \n");   
       	System.out.println("Dia: ");
        diaEmprestimo = ler.nextInt();
        System.out.println("Mes: ");
        mes = ler.nextInt();
        System.out.println("Ano: ");
        ano = ler.nextInt();
    }
    
    @Override
    public void dataDevolucao()
    {
    	System.out.println("Devolver ate: "+diaEmprestimo+30);
    }
    
    
    public int getQtdPessoas()
    {
        return this.qtdPessoas;
    }

    public int getMaxEmprestimo()
    {
        return this.maxEmprestimo;
    }

    public void setDadosEndereco()
    {   
        String rua, bairro, cidade, estado;
        int n;
        System.out.println("Rua: ");
        rua = ler.nextLine();
        System.out.println("Numero: ");
        n = ler.nextInt();
        System.out.println("Bairro: ");
        bairro = ler.nextLine();
        System.out.println("Cidade: ");
        cidade = ler.nextLine();
        System.out.println("Estado: ");
        estado = ler.nextLine();
        dadosEndereco.setEndereco(rua,n,bairro,cidade,estado);
    }

    public void setDataNascimento()
    {   
        int dia, mes, ano;
        do{
       	System.out.println("Data de Nascimento\n");   
       	System.out.println("Dia: ");
        dia = ler.nextInt();
        System.out.println("Mes: ");
        mes = ler.nextInt();
        System.out.println("Ano: ");
        ano = ler.nextInt();
        dataNascimento.setData(dia, mes, ano);
        }while(dataNascimento.getDia() == -9999);
    }

    public void setNome(String nome)
    {
        this.nome = nome;
        qtdPessoas++;
    }


    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;   
    }

    public String getNome()
    {
        return this.nome;
    }
    public int getIdade()
    {
        return this.idade;
    }
    
    public String getGenero()
    {
        return this.genero;
    }

    public void listaNomes(int n, Pessoa gente){
        //system("cls");
    	System.out.println("Lista de Nomes\n\n");
        for(int i=1;i<=n;i++){
        	System.out.println(" "+i);
        	System.out.println("- "+gente.getNome());
        }
    }

    public void setDados()
    {   
        //system("cls");
    	System.out.println("Dados: \n");
    	System.out.println("Nome: "+nome);
    	System.out.println("\nIdade: "+idade);
    	System.out.println("\nData de nascimento: "+dataNascimento.getDia()+"/"
    	+dataNascimento.getMes()+"/"+dataNascimento.getAno());
    	System.out.println("\nGenero: "+genero);
        dadosEndereco.getEndereco();
    }	

}
