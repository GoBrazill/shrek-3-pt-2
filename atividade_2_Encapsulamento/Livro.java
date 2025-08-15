package atividade_2_Encapsulamento;

public class Livro {
	
	private String titulo, autor;
	private int numPaginas;
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumPaginas(int numPaginas) {
		if (numPaginas < 5) {
			System.out.println("Número de páginas inválido");
			return;
		}
		
		this.numPaginas = numPaginas;
	}
	
	
}