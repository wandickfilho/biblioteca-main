package Projeto;
import java.util.Scanner;

public class Menu {

    private Livro[] livros = new Livro[5];
    private int quantidade = 0;

    private void cadastrarLivro(Livro livro) {
        livros[quantidade] = livro;
        quantidade++;
        System.out.println("Livro cadastrado!");
    }

    private void listarLivros() {
        if (quantidade == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println(livros[i]);
            }
        }
    }

    private Livro buscarLivro(int id) {
        for (int i = 0; i < quantidade; i++) {
            if (livros[i].getId() == id) {
                return livros[i];
            }
        }
        return null;
    }

    private void emprestarLivro(int id) {
        Livro livro = buscarLivro(id);
        if (livro != null && livro.getEstoque() > 0) {
            livro.diminuirEstoque();
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("Livro indisponivel.");
        }
    }

    private void devolverLivro(int id) {
        Livro livro = buscarLivro(id);
        if (livro != null) {
            livro.aumentarEstoque();
            System.out.println("Livro devolvido!");
        } else {
            System.out.println("Livro nao encontrado.");
        }
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=======Menu=======");
            System.out.println("\n1 - Cadastrar Livro");
            System.out.println("2 - Listar Catalogo");
            System.out.println("3 - Buscar Livro");
            System.out.println("4 - Emprestar Livro");
            System.out.println("5 - Devolver Livro");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma Opcao: ");
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
                    cadastrarLivro(new Livro(id, titulo, estoque));
                    break;

                case 2:
                    listarLivros();
                    break;

                case 3:
                    System.out.print("ID do livro: ");
                    id = sc.nextInt();
                    Livro livro = buscarLivro(id);
                    if (livro != null) {
                        System.out.println(livro);
                    } else {
                        System.out.println("Livro nao encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID do livro: ");
                    id = sc.nextInt();
                    emprestarLivro(id);
                    break;

                case 5:
                    System.out.print("ID do livro: ");
                    id = sc.nextInt();
                    devolverLivro(id);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
        sc.close();
    }
}