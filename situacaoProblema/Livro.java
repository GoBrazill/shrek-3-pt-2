package situacaoProblema;

public class Livro implements Emprestavel {
	// vou deixar o status como boolean sendo true que o livro está disponível e
	// false emprestado
	private int codigo;
	private String titulo;
	private String autor;
	private boolean status;

	public Livro(int codigo, String titulo, String autor, boolean status) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void emprestar(boolean status) {
		// acho que essa logica vai estar na classe do usuario
		status = this.status;
		if (status == true) {
			System.out.println("Você pegou este livro emprestado");
			this.status = false;
		} else {
			System.out.println("Este livro já está emprestado");
		}
	}

	public void devolver(boolean status) {
		status = this.status;
		if (status == false) {
			System.out.println("Obrigado por devolver este livro");
			this.status = true;
		} else {
			System.out.println("Este livro já tinha sido devolvido");
		}
	}

	// De cara não faço idéia o que vou fazer aqui já que defini os metodos de
	// emprestar e devolver diretamente na classe do livro
	@Override
	public void emprestar(Usuario u) {
		int limite = u.getLimiteEmprestimos();
		if (limite == 0) {
			System.out.println(u.getNome()
					+ "atingiu o limite de empréstimos e deve devolver um livro para pegar outro emprestado");
		} else {
			System.out.println("Livro emprestado");
			limite -= 1;
		}
	}
	
	// não faço idéia do que fazer aqui
	@Override
	public void devolver() {
	}

}
