package atividade1_encapsulamento;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Produto p = new Produto();
		
		System.out.println("Qual o nome do produto?");
		p.setNome(scn.next());
		
		System.out.println("Qual o preço?");
		p.setPreco(scn.nextDouble());
		
		System.out.println("Foi aplicado um desconto de 10%");
		p.aplicarDesconto(p.getPreco()); 
		
		System.out.println("Preço final: R$" + p.getPreco());
		
		scn.close();
		
	}

}
