package situacaoProblema;

import java.time.LocalDate;

public class Emprestimo {
	private Usuario id;
	private Livro codigo;

	public Emprestimo(Usuario id, Livro codigo) {
		super();
		this.id = id;
		this.codigo = codigo;
	}

	public Usuario getId() {
		return id;
	}

	public void setId(Usuario id) {
		this.id = id;
	}

	public Livro getCodigo() {
		return codigo;
	}

	public void setCodigo(Livro codigo) {
		this.codigo = codigo;
	}

	public void dataDevolucao(Livro l) {
		LocalDate diaEmprestimo = LocalDate.now();
		LocalDate diaDevolucao = diaEmprestimo.plusDays(7);
		System.out.println(
				l.getTitulo() + " emprestado na data: " + diaEmprestimo + "\nData prevista de devolução: " + diaDevolucao);
	}

}
