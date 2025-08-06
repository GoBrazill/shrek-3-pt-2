package atividadeContaBanco;

public class Conta {

	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void sacar(double saque) {
		if (saldo > saque) {
			saldo = saldo - saque;
			System.out.println("seu saldo atual é:" + saldo);
		} else {
			System.out.println("saldo insuficiente");
		}
	}
}
