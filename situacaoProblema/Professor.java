package situacaoProblema;

public class Professor extends Usuario{

	public Professor(int id, String nome, String email) {
		super(id, nome, email);
	}

	@Override
	int getLimiteEmprestimos() {
		return 5;
	}
	
}
