package br.ufpa.cbcc.pessoa;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String resp1, resp2, nome, genero, livro;
		int n, op, op1, idade;
		Funcionario pessoas[] = new Funcionario[10];

		int indexPessoa=0;
		
		pessoas[0] = new Funcionario();
		
		/*vector <PessoaFisica*> pessoas;//vector para estanciar mais de uma pessoa
	    
	    pessoas.push_back(new Funcionario);
	    pessoas.push_back(new Cliente);
	    
	    for(int i=0; i<pessoas.size();i++)
	    {
	        Funcionario * funcionarioPtr = dynamic_cast<Funcionario *>(pessoas[i]);//dynamic cast para chamar os métodos do funcionario.
	        if (funcionarioPtr != 0)
	        {
	            funcionarioPtr->autenticacao();
	        }
	        else
	        {
	            Cliente * clientePtr = dynamic_cast<Cliente *>(pessoas[i]);//dynamic cast para chamar os métodos do funcionario.
	            if (clientePtr != 0) 
	            {
	                clientePtr->autenticacao();
	            }
	        }
	    }
			 */
	
		do{
		    pessoas[indexPessoa].apresentarMenu();
		    System.out.println("\n");
		    System.out.println("\n\n\nQuantidade de usuario cadastrado: "+pessoas.length+"\n\n");
		    resp1="n";
		    op = ler.nextInt();;
		        switch(op)
		        {
		        case 1:
		        {     
		          //  system("cls"); 
		        	System.out.println("::: CADASTRO :::\n\n");
		            
		            //pessoas.push_back(new Cliente);
		            
		            //indexPessoa=pessoas.length-1;
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
		            //pessoas[indexPessoa].autenticacao();//Método virtual da classe Cliente
		            System.out.println("\n\nNumero de Registro: "+indexPessoa);
		            //getch();
		            break;
		        }
		        case 2:
		        {   
		            //system("cls");
		        	
		        if(pessoas.length >= 0)
		        	{ 
		        		 pessoas[indexPessoa].listaNomes(pessoas);
		        	 do{
		        		 resp2="n";
				         System.out.println("\n\nDigite o numero de Registro: ");
				         indexPessoa = ler.nextInt();
				         if(indexPessoa>=0 && indexPessoa<pessoas.length) resp2="s";
				     }while(resp2=="n");  //só pra fluir direito..
		        	 do{
		        		 resp2="n";
				         //system("cls");
				         System.out.println("Usuario: "+pessoas[indexPessoa].getNome()+"\n");
				         System.out.println("Numero de Registro: "+indexPessoa+"\n\n");
				         pessoas[indexPessoa].apresentarMenu();
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
				         livro = ler.nextLine();
				         //system("cls");
				         System.out.println("Confirmar Usuario\n\n");
				         System.out.println("Senha: ");
				         senhatest = ler.nextLine();                    
				         if(senhatest == pessoas[indexPessoa].getSenha())
				         pessoas[indexPessoa].adcionarLivro(livro);
				         else System.out.println("senha incorreta!");
				         //getch();
				                   
				         break;
				         }
				         case 3: 
				         {   
				         //system("cls");
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
		        	}else
		            {
		            	System.out.println("Usuarios nao cadastrados\n");
		                //getch();
		                break;
		            }   
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