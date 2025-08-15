package atividade_2_Encapsulamento;

public class Exercicio03 {

	public static void main(String[] args) {

		Livro livro = new Livro();

		livro.setTitulo("Duna");

		livro.setAutor("Frank Herbert");

		livro.setNumPaginas(4);

		System.out.println("Título: " + livro.getTitulo() + ", autor: " + livro.getAutor() + ", número de páginas: "
				+ livro.getNumPaginas());

	}

}