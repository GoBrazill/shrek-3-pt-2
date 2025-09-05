package abstracaoContasBancarias;

public abstract class Conta {
	
	private int numero;
	private int agencia;
	private double saldo;
	private String titular;
	
	
	public Conta(int numero, int agencia, double saldo, String titular) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titular = titular;
	}


	@Override
	public String toString() {
		return "\nAgência: " + agencia + ",\nNumero da conta: " + numero + ",\nSaldo: " + saldo + ",\nTitular: " + titular;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	abstract void depositar(double valor);
	abstract void sacar(double valor);
	abstract void exibirSaldo(double valor);
	abstract void calcularTarifaMensal();
}
