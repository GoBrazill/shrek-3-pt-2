package situacaoProblema;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	Scanner scn = new Scanner(System.in);

	private ArrayList<Usuario> listaUsuario = new ArrayList<>();
	private ArrayList<Livro> listaLivro = new ArrayList<>();

	public void adicionarUsuario(Usuario u) {
		listaUsuario.add(u);
	}

	public void adicionarLivro(Livro l) {
		listaLivro.add(l);
	}
// esse método inteiro foi feito com ia
	public void emprestarLivro(Usuario u, String codigo) {
		Livro encontrar = null;
		for (Livro livro : listaLivro) {
			if (livro.getCodigo().equals(codigo)) {
				encontrar = livro;
				break;
			}
		}
		if (encontrar == null) {
			System.out.println("Livro com o código " + codigo + " não encontrado!");
			return;
		}
		
		boolean encontrado = encontrar.emprestar(u);
		if (encontrado) {
			System.out.println("Empréstimo realizado com sucesso: " + u.getNome() + " -> " + codigo);
			encontrar.emprestar(false);
		} else {
			System.out.println("Não foi possível realizar o empréstimo de " + codigo);
		}
	}

	public void devolverLivro(Usuario u, String codigo) {

	}

	@Override
	public String toString() {
		return "Biblioteca [listaLivro=" + listaLivro + "]";
	}

}
