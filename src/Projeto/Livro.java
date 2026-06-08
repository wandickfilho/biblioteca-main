package Projeto;

public class Livro {

    private int id;
    private String titulo;
    private int estoque;
    private int emprestados;

    public Livro(int id, String titulo, int estoque) {
        this.id = id;
        this.titulo = titulo;
        this.estoque = estoque;
        this.emprestados = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getEmprestados() {
        return emprestados;
    }

    public void diminuirEstoque() {
        if (estoque > 0) {
            estoque--;
            emprestados++;
        }
    }

    public void aumentarEstoque() {
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
