package atividade1_encapsulamento;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.println("Qual é o seu nome?");
		p.setName(scn.next());
		
		System.out.println("O seu nome é: " + p.getName());
		
		System.out.println("Qual é a sua idade?");
		p.setIdade(scn.nextInt());
		
		if (p.getIdade() < 0) {
			System.out.println("Idade inválida");
		} else {
			System.out.println("A sua idade é: " + p.getIdade());					
		}
			
		
		scn.close();
		
	}

}
