package Projeto;

public class Livro {

    int id;
    String titulo;
    int estoque;
    int emprestados;

    Livro(int id, String titulo, int estoque) {
        this.id = id;
        this.titulo = titulo;
        this.estoque = estoque;
        this.emprestados = 0;
    }

    void diminuirEstoque() {
        if (estoque > 0) {
            estoque--;
            emprestados++;
        }
    }

    void aumentarEstoque() {
        if (emprestados > 0) {
            estoque++;
            emprestados--;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Titulo: " + titulo + " | Estoque: " + estoque;
    }
}