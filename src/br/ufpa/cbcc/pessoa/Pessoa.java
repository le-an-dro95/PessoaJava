package br.ufpa.cbcc.pessoa;
import java.util.Scanner;
import java.util.ArrayList;

//ler sobre alocação dinamica e construtor de cópia;
//fazer o main;

public abstract class Pessoa implements InfEmprestimo, Autenticavel{
	Scanner ler = new Scanner(System.in);
    public String nome;
    public int idade;
    public String genero; 
    private Data dataNascimento;
    private Data dataEmprestimo;
    private Endereco dadosEndereco;
    private int indexPessoa;
    private int qtdPessoas=0;
    private int diaEmprestimo;
    private static int maxEmprestimo=3;
    private int qtddeLivros=0; 
    private String usuario;
    private String senha;
    private int i;
    ArrayList<String> livroNomes = new ArrayList<String>();
	
    public abstract void apresentarMenu();
    
    public Pessoa()
    {
    	dataNascimento = new Data(01,01,1900);
    	dadosEndereco = new Endereco("Rua",0,"bairro","cidade","estado");
        this.nome= "nome";
        this.idade= 0;
        this.genero= "genero";
    }

    public Pessoa(String nome, int idade, String genero, int dia,
    			  int mes,int ano, String rua, int numero, 
    			  String bairro, String cidade, String estado)
    {
    	dataNascimento = new Data(dia, mes, ano);
    	dadosEndereco = new Endereco(rua, numero, bairro, cidade, estado);  			
        this.nome = nome; 
        this.idade = idade;
        this.genero = genero;
    }
    
    public Pessoa(String nome, int idade, String genero)
    {
    	this.nome = nome; 
        this.idade = idade;
        this.genero = genero;//só pra testar;
    }
    
    
    public Pessoa(Pessoa p)
    {
        this.nome = p.nome; 
        this.idade = p.idade;
        this.genero = p.genero;
    }
    
    public void adcionarLivro(String livro)   
    {
      if(qtddeLivros<maxEmprestimo)
      {
   	   livroNomes.add(livro);
   	   qtddeLivros = livroNomes.size();
      }else 
      {
          //system("cls");
          System.out.println("\n\nNumero maximo de emprestimo atingido");
          //getch();
      }
  }

  public void remLivro()   //precisa testar..
  //Remove livro com alocação dinamica de memoria..
  {
      int rem;
      
      if(qtddeLivros!=0)
      {
      //system("cls");
      System.out.println(":::Livros Emprestados::: \n\n");
      for(i=0;i<qtddeLivros;i++){
          System.out.printf("%d- %s\n", qtddeLivros, livroNomes.get(i));
      }
      
      System.out.println("Digite o numero do Livro que deseja remover: ");
      rem = ler.nextInt();
      livroNomes.remove(0);

      System.out.println("Livro Removido!");
      }
      else
      {
      System.out.println("Usuario nao possui livro emprestado");
      }
  }
    
  public void listarLivros() //precisa testar..
  {   
      if(qtddeLivros!=0){
    	  System.out.println(":::Livros Emprestados::: \n\n");
          for(i=0;i<qtddeLivros;i++){
              System.out.printf("%d- %s\n", qtddeLivros, livroNomes.get(i));
          }
      }
      else System.out.println("Usuario nao possui livro emprestado");
  }
    
    @Override
	public void dadosParaAutenticacao()
	{
    	System.out.println("Usuario: ");
    	this.usuario = ler.next();
    	System.out.println("Senha: ");	
		this.senha= ler.next();
	System.out.println("Usou o autenticacao() implementado no Pessoa");
	}
    
	@Override
	public boolean validar()
	{
		System.out.println("Escreveu metodo validar no Pessoa");
		if (usuario == "123" && senha == "123")
			return true;
		return false;
	}
    
    @Override
    public void gravarDataEmprestimo()
    {
    	int mesEmprestimo, anoEmprestimo;
       	System.out.println("Data de Hoje: \n");   
       	System.out.println("Dia: ");
        diaEmprestimo = ler.nextInt();
        System.out.println("Mes: ");
        mesEmprestimo = ler.nextInt();
        System.out.println("Ano: ");
        anoEmprestimo = ler.nextInt();
       	dataEmprestimo.setData(diaEmprestimo, mesEmprestimo, anoEmprestimo);
    }
    
    @Override
    public void mostrarDataDevolucao()
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
        rua = ler.next();
        System.out.println("Numero: ");
        n = ler.nextInt();
        System.out.println("Bairro: ");
        bairro = ler.next();
        System.out.println("Cidade: ");
        cidade = ler.next();
        System.out.println("Estado: ");
        estado = ler.next();
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

    public void listaNomes(Cliente [] pessoas){
        //system("cls");
    	System.out.println("Lista de Nomes\n\n");
        for(i=0;i<=indexPessoa;i++){
        	System.out.println(" "+i+"- "+pessoas[i].getNome());
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
