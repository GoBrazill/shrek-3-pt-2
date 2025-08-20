package heranca;

public class Contador extends Funcionario {

	private int numCrc;

	public Contador(String nome, String rg, double salario, int numCrc) {
		super(nome, rg, salario);
		this.numCrc = numCrc;
	}

	public int getNumCrc() {
		return numCrc;
	}

	public void setNumCrc(int numCrc) {
		this.numCrc = numCrc;
	}
	
	
}
