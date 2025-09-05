package abstracaoContaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int opcao;
		boolean contaCriada = false;
		char criarConta;
		Conta conta = null;
		
		do {
			System.out.println("Bem Vindo ao banco do Zé! Qual conta deseja abrir? \n 1.Conta Corrente. \n 2.Conta Poupança. \n 3.Conta Pessoa Jurídica.");
			opcao = scn.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Tem certeza que quer criar a conta? (Sim ou não)");
				criarConta = scn.next().charAt(0);
				if (criarConta == 'n') {
					System.out.println("Conta não criada!");
					break;
				} else {
					conta = new ContaCorrente(0002, 8922, 0, "");
					System.out.println("Digite o seu nome");
					conta.setTitular(scn.nextLine());
					
					scn.nextLine();
					
					System.out.println("Deposite um valor inicial");
					conta.setSaldo(scn.nextDouble());
					
					conta.calcularTarifaMensal();
					
					contaCriada = true;
					break;					
				}
			case 2:
				System.out.println("Tem certeza que quer criar a conta? (Sim ou não)");
				criarConta = scn.next().charAt(0);
				if(criarConta == 'n') {
					System.out.println("Conta não criada!");
					break;
				} else {					
					conta = new ContaPoupanca(0002, 8922, 0, "");
					
					scn.nextLine();
					
					System.out.println("Digite o seu nome");
					conta.setTitular(scn.nextLine());
					
					System.out.println("Deposite um valor inicial");
					conta.setSaldo(scn.nextDouble());
					
					System.out.println("Conta criada com sucesso!" + conta.toString());
					
					contaCriada = true;
					break;
				}
			case 3:
				System.out.println("Tem certeza que quer criar a conta? (Sim ou não)");
				criarConta = scn.next().charAt(0);
				if (criarConta == 'n') {
					System.out.println("Conta não criada");
					break;
				} else {					
					conta = new ContaPessoaJuridica(0002, 8922, 0, "");
					System.out.println("Digite o seu nome");
					conta.setTitular(scn.nextLine());
					
					scn.nextLine();
					
					System.out.println("Deposite um valor inicial");
					conta.setSaldo(scn.nextDouble());
					
					conta.calcularTarifaMensal();
					
					contaCriada = true;
					break;
				}
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
		} while (!contaCriada);
		
		while (true) {
			int opcaoConta;
			System.out.println("O que deseja fazer na sua conta? \n 1.Sacar. \n 2.Depositar. \n 3.Ver saldo ");
			opcaoConta = scn.nextInt();
			switch (opcaoConta) {
			case 1:
				System.out.println("Quanto deseja sacar?");
				conta.sacar(scn.nextDouble());
				break;
			case 2:
				System.out.println("Quanto deseja depositar?");
				conta.depositar(scn.nextDouble());
				break;
			case 3:
				System.out.println(conta.toString());
				break;
			default:
				System.out.println("Digite uma opção válida!");
				scn.close();
				break;
			}
			
		}
	}

}