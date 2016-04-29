package br.ufpa.cbcc.pessoa;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ArrayList<PessoaFisica> pessoasFisica = new ArrayList<>();
		
		pessoasFisica.add(new Cliente());
		pessoasFisica.add(new Funcionario());
		
		for (PessoaFisica pessoa : pessoasFisica) //para testar o método sobrescrito..
		{
			pessoa.autenticar();
			
			if(pessoa instanceof Cliente)
			{
				((Cliente) pessoa).listarLivros();
			}
		}
		
		Scanner ler = new Scanner(System.in);
		String lerTeclado, resp1, resp2, nome, genero, livro;
		int qtdCadastro=0, op, op1, idade, cont=11, numReg;
		
		Funcionario funcionario = new Funcionario();
		Cliente pessoas[] = new Cliente[10];

		int indexPessoa=0;
		do{
			op=999;
		    while (true)
		    {
		    funcionario.apresentarMenu();
		    System.out.println("\n");
		    System.out.println("\n\n\nQuantidade de usuario cadastrado: "+indexPessoa+"\n\n");
	    	lerTeclado = ler.nextLine();
		    resp1="n";
		    try {
		    	op = Integer.parseInt(lerTeclado);
		    	break;
		    } catch(NumberFormatException e)
		    {
		    	System.out.println("Somente Numeros");
		    }
		    }
		        switch(op)
		        {
		        case 1:
		        {     
		          //  system("cls"); 
		        	System.out.println("::: CADASTRO :::\n\n");
		        	
		        	cont=cont-1;
		            indexPessoa=pessoas.length-cont;
		            System.out.println(" "+indexPessoa);
		            pessoas[indexPessoa] = new Cliente();
		
		        	System.out.println("Nome: ");
		            nome = ler.next();
		            pessoas[indexPessoa].setNome(nome);
		            System.out.println("Idade: ");
		            idade = ler.nextInt();
		            pessoas[indexPessoa].setIdade(idade);
		            pessoas[indexPessoa].setDataNascimento();
		            System.out.println("Genero: ");
		            genero = ler.next();
		            pessoas[indexPessoa].setGenero(genero);
		            pessoas[indexPessoa].setDadosEndereco();
		            pessoas[indexPessoa].setCpf(); //Método da Classe PessoaFisica
		            pessoas[indexPessoa].autenticar();//Método virtual da classe Cliente
		            System.out.println("\n\nNumero de Registro: "+indexPessoa);
		            qtdCadastro=indexPessoa;
		            //getch();
		            break;
		        }
		        case 2:
		        {   
		        		try{
		        		 pessoas[indexPessoa].listaNomes(pessoas);
		        		} catch(NullPointerException e)
		        		{
		        			System.out.println("Nao existem usuarios cadastrados");
		        			ler.next();
		        			break;
		        		}
		        		 resp2="n";
				         System.out.println("\n\nDigite o numero de Registro: ");
				         numReg = ler.nextInt();
				         System.out.println("Usuario: "+pessoas[indexPessoa].getNome()+"\n");
				         System.out.println("Numero de Registro: "+indexPessoa+"\n\n");
				         pessoas[indexPessoa].apresentarMenu();
		        		 
		        		 do{
			        	 resp2="n";
				         op1 = ler.nextInt();
				         switch(op1)
				         {
				         case 1: 
				         {
				        	 pessoas[indexPessoa].setDados();
				             System.out.println("CPF: "+pessoas[indexPessoa].getCpf());
				             //getch();
				             break;
				         }
				         case 2: 
				         {   
				         String logintest;
				         String senhatest;
				         //system("cls");
				         System.out.println("Quantidade Maxima de emprestimo: "+pessoas[indexPessoa].getMaxEmprestimo()+"\n\n");
				         System.out.println("Nome do Livro: ");
				         livro = ler.next();
				         //system("cls");
				         System.out.println("Confirmar Usuario\n\n");
				         System.out.println("Senha: ");
				         senhatest = ler.next();                    
				         if(senhatest == pessoas[indexPessoa].getSenha())
				         pessoas[indexPessoa].adcionarLivro(livro);
				         else System.out.println("senha incorreta!");          
				         break;
				         }
				         case 3: 
				         {   
				         pessoas[indexPessoa].remLivro();
				         break;         
				         }	
				         case 4:
				         {
				         pessoas[indexPessoa].listarLivros();
				         break;
				         }
				         case 5:
				         {
				         resp2="s";
				         break;
				         }
				         }
				      }while(resp2!="s");  
		        break;   
		        }
		        case 3:
		        {
		           // system("cls");
		        	System.out.println("Cadastrar Livro\n\n");
		        	System.out.println("Titulo: ");
		            String novolivro;
		            novolivro  = ler.next();
		            break;
		        }
		        case 4:
		        {
		            //system("cls");
		        	System.out.println("Cadastrar Funcionario\n");
		        	System.out.println("Nome: ");
		            String nomefunc;
		            nomefunc = ler.next();
		            break;
		        }
		        case 5:
		        {
		            resp1="s";
		            break;
		        }
		        }
		        
		    }while(resp1!="s");   
		    
		    //deletando os elementos do vector.
		}
}