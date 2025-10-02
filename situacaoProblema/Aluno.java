package situacaoProblema;

public class Aluno extends Usuario{

	public Aluno(int id, String nome, String email) {
		super(id, nome, email);
	}

	@Override
	int getLimiteEmprestimos() {
		return 2;
	}

	
}
