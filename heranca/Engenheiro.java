package heranca;

public class Engenheiro extends Funcionario{
	
	private int numCrea;

	public Engenheiro(String nome, String rg, double salario, int numCrea) {
		super(nome, rg, salario);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(int numCrea) {
		this.numCrea = numCrea;
	}
	
	
}
