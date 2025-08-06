package atividadeContaBanco;

import java.util.Scanner;

public class Main {
	
	// atividade que teve quinta feira que eu faltei 
	// só acompanhei a professora para fazer a atividade 
	// vou fazer de novo sem olhar nessa atividade e do meu próprio jeito

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Conta ct = new Conta();
		
		System.out.println("Bem-Vindo, digite o valor do depósito inicial");
		ct.depositar(scn.nextDouble());
		System.out.println("seu saldo atual é: " + ct.getSaldo());
		
		System.out.println("Digite o valor do Saque: ");
		ct.sacar(scn.nextDouble());
		
		scn.close();
	}

}
