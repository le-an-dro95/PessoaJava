package br.ufpa.cbcc.pessoa;
import java.util.Scanner;

//ler sobre alocação dinamica e construtor de cópia;
//fazer o main;

public abstract class Pessoa implements InfEmprestimo, Autenticavel{
	Scanner ler = new Scanner(System.in);
    public String nome;
    public int idade;
    public String genero; 
    private Data dataNascimento;
    private Endereco dadosEndereco;
    
    private int indexPessoa;
    private int qtdPessoas=0;
    private static int maxEmprestimo=3;
    private int qtddeLivros=0; 
    private String livroNomes[];
    private int diaEmprestimo;
    private String usuario;
    private String senha;
	
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
    
    /*construtor de cópia
    public Pessoa(Pessoa p)
    {
    	dadosEndereco(p.dadosEndereco);
    	dataNascimento(p.dataNascimento);
        this.nome = p.nome; 
        this.idade = p.idade;
        this.genero = p.genero;
    }
    */
    
    
    
    public void adcionarLivro(String livro)
  //Adiciona o livro por meio de alocação dinamica de memoria com limite de ate 3 livros.
    {
      if(qtddeLivros<maxEmprestimo)
      {
      if(qtddeLivros!=0)
      {
      String[] aux;
      
      for(int i=0;i<qtddeLivros;i++)
          aux[i] = livroNomes[i];
      
      //delete [] livroNomes;
      
      livroNomes = new String[++qtddeLivros];
      
      for(int i=0;i<qtddeLivros-1;i++)
          livroNomes[i] = aux[i];
          
      livroNomes[qtddeLivros-1]= livro;
      
      //delete [] aux;
      }
       else
      {
    	   String[]livroNomes;
    	   this.livroNomes[0] = livro;
      }
      }
      else 
      {
          //system("cls");
          System.out.println("\n\nNumero maximo de emprestimo atingido");
          //getch();
      }
  }

  public void remLivro()
  //Remove livro com alocação dinamica de memoria..
  {
      int rem, i;
      
      if(qtddeLivros!=0)
      {
      //system("cls");
      System.out.println(":::Livros Emprestados::: \n\n");
      for(i=0;i<qtddeLivros;i++){
          System.out.println(" "+i +"- "+livroNomes[i]);
      }
      
      System.out.println("Digite o numero do Livro que deseja remover: ");
      rem = ler.nextInt();
      
      String [] aux;
      
      for(i=0;i<qtddeLivros;i++)
          aux[i] = livroNomes[i];
      
      //delete [] livroNomes;
      
      String [] livroNomes;
      
      for(i=0;i<rem;i++){
          livroNomes[i]=aux[i];
      }
          
      for(i=rem;i<qtddeLivros;i++){
          livroNomes[i] = aux[i+1];
      }
      
      //delete [] aux;
      System.out.println("Livro Removido!");
      //getch();
      }
      else
      {
      System.out.println("Usuario nao possui livro emprestado");
      //getch();
      }
  }
    
  public void listarLivros()
  {   
      //system("cls");
      if(qtddeLivros!=0){

          System.out.println(":::Livros Emprestados:::");
          for(int i=0;i<qtddeLivros;i++){
        	  System.out.println(" "+i+"- "+livroNomes[i]);
          }
      }
      else System.out.println("Usuario nao possui livro emprestado");
      //getch();
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
