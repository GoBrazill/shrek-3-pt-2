package heranca;

public class Funcionario {
	
	private String nome;
	private String rg;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public String getRg() {
		return rg;
	}
	public double getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Funcionario(String nome, String rg, double salario) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", rg=" + rg + ", salario=" + salario + "]";
	}
	
		
}
