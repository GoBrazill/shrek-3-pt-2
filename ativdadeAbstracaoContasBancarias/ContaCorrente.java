package abstracaoContaBancaria;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia, double saldo, String titular) {
		super(numero, agencia, saldo, titular);
	}

	@Override
	void depositar(double valor) {
		double novoSaldo;
		if (valor < 0) {
			System.out.println("O valor do deposito deve ser positivo! Valor não depositado.");
		} else if (valor == 0) {
			System.out.println("O valor do depósito não pode ser 0");
		} else {
			System.out.printf("R$%.2f" + " foram adicionados a sua conta %n", valor);
			novoSaldo = getSaldo() + valor;
			setSaldo(novoSaldo);
		}

	}

	@Override
	void sacar(double valor) {
		double novoSaldo;
		if (valor <= 0) {
			System.out.println("O valor do saque deve ser positivo!");
		} else if (valor > getSaldo()) {
			System.out.println("O valor do saque exede o saldo na conta! Saque não efetuado.");
		} else {
			novoSaldo = getSaldo() - valor;
			setSaldo(novoSaldo);

			System.out.printf("\nR$%.2f" + "foram sacados da sua conta", valor);
			System.out.printf("\nSaldo atualizado: R$%.2f", getSaldo());
		}
	}

	@Override
	void exibirSaldo() {
		System.out.printf("\nSeu saldo é de: R$%.2f", getSaldo());
	}

	@Override
	void calcularTarifaMensal() {
		double tarifa = 12.00;
		double novoSaldo;
		novoSaldo = getSaldo() - tarifa;
		setSaldo(novoSaldo);
		System.out.println("Foi descontado um Valor mensal fixo de R$12,00");
	}

}