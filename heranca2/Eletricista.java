package heranca2;

public class Eletricista extends Funcionario {
	private boolean nr10;

	public Eletricista(String nome, String rg, double salario, boolean nr10) {
		super(nome, rg, salario);
		this.nr10 = nr10;
	}
	
	@Override
	public double calculoSalario(double salario) {
		return salario = salario - 100 + 1000;
	}
}
