package Projeto;
import java.util.Scanner;
import Projeto.Livro;
import Projeto.Biblioteca;
public class Menu {
	
	  public void iniciar() {

	        Scanner sc = new Scanner(System.in);
	        Biblioteca sistema = new Biblioteca();

	        int opcao;

	        do {
	        	System.out.println("\n=======Menu=======");
	            System.out.println("\n1 - Cadastrar Livro");
	            System.out.println("2 - Listar Catalogo");
	            System.out.println("3 - Buscar Livro");
	            System.out.println("4 - Emprestar Livro");
	            System.out.println("5 - Devolver Livro");
	            System.out.println("0 - Sair");
	            System.out.print("\nEscolha uma Opção: ");
	            opcao = sc.nextInt();

	            switch (opcao) {

	                case 1:
	                    System.out.print("ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Titulo: ");
	                    String titulo = sc.nextLine();

	                    System.out.print("Estoque: ");
	                    int estoque = sc.nextInt();

	                    sistema.cadastrarLivro(
	                            new Livro(id, titulo, estoque));
	                    break;

	                case 2:
	                    sistema.listarLivros();
	                    break;

	                case 3:
	                    System.out.print("ID do livro: ");
	                    id = sc.nextInt();

	                    Livro livro = sistema.buscarLivro(id);

	                    if (livro != null) {
	                        System.out.println(livro);
	                    } else {
	                        System.out.println("Livro nao encontrado.");
	                    }
	                    break;

	                case 4:
	                    System.out.print("ID do livro: ");
	                    id = sc.nextInt();
	                    sistema.emprestarLivro(id);
	                    break;

	                case 5:
	                    System.out.print("ID do livro: ");
	                    id = sc.nextInt();
	                    sistema.devolverLivro(id);
	                    break;
	            }

	        } while (opcao != 0);

	        sc.close();
	    }
}
 