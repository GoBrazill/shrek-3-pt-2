package abstracaoContasBancarias;

public class Corrente extends Conta{

	public Corrente(int numero, int agencia, double saldo, String titular) {
		super(numero, agencia, saldo, titular);
	}

	@Override
	void depositar(double valor) {
		
	}

	@Override
	void sacar(double valor) {
		
	}

	@Override
	void exibirSaldo(double valor) {
		
	}

	@Override
	void calcularTarifaMensal() {
		
	}
	
}