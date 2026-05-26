package model;

public class Livro {
	private static int contadorId = 0;
	private int id;
	private String titulo;
	private String descricao;
	private String autor;
	private int quantidade;
	private boolean emEstoque = true;

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isEmEstoque() {
		return emEstoque;
	}
	public Livro(String titulo,String descricao,String autor, int quantidade) {
			this.id = ++contadorId;
			this.titulo = titulo;
			this.descricao = descricao;
			this.autor = autor;
			this.quantidade = quantidade;
			this.emEstoque = false;
			if (quantidade > 0) {
				this.emEstoque = true;
			}
			else {
				this.emEstoque = false;
			}
	}
	
	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", autor=" + autor
				+ ", quantidade=" + quantidade + ", emEstoque=" + emEstoque + "]";
	}

	public void aumentarEstoque(int quantidadeAdd) {
		quantidade += quantidadeAdd;
		
		if (quantidade > 0) {
			emEstoque = true;
		}
	}
	public void diminuirEstoque (int quantidadeRem) {
		if (quantidadeRem > quantidade) {
            throw new IllegalStateException("Estoque insuficiente.");
		}
		quantidade-=quantidadeRem;
		
		if (quantidade == 0) {
			emEstoque = false;
		}
		emEstoque = quantidade > 0;
	}
	
}