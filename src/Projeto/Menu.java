package Projeto;

import java.util.Scanner;

public class Menu {

    Livro[] livros = new Livro[10];
    int quantidade = 0;

    void cadastrarLivro(Livro livro) {
        if (quantidade < livros.length) {
            livros[quantidade] = livro;
            quantidade++;
            System.out.println("Livro cadastrado!");
        } else {
            System.out.println("Catalogo cheio!");
        }
    }

    void listarLivros() {
        if (quantidade == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println(livros[i]);
            }
        }
    }

    Livro buscarLivro(int id) {
        for (int i = 0; i < quantidade; i++) {
            if (livros[i].id == id) {
                return livros[i];
            }
        }
        return null;
    }

    void emprestarLivro(int id) {
        Livro livro = buscarLivro(id);

        if (livro != null && livro.estoque > 0) {
            livro.diminuirEstoque();
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("Livro indisponivel.");
        }
    }

    void devolverLivro(int id) {
        Livro livro = buscarLivro(id);

        if (livro != null) {
            livro.aumentarEstoque();
            System.out.println("Livro devolvido!");
        } else {
            System.out.println("Livro nao encontrado.");
        }
    }

    void iniciar() {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Catalogo");
            System.out.println("3 - Buscar Livro");
            System.out.println("4 - Emprestar Livro");
            System.out.println("5 - Devolver Livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

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

                    Livro livro = new Livro(id, titulo, estoque);
                    cadastrarLivro(livro);
                    break;

                case 2:
                    listarLivros();
                    break;

                case 3:
                    System.out.print("ID do livro: ");
                    id = sc.nextInt();

                    livro = buscarLivro(id);

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