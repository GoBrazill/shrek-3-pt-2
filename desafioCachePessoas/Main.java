package desafioCachePessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		ArrayList<Pessoa> banco = new ArrayList<>();
		ArrayList<Pessoa> cache = new ArrayList<>();

		Pessoa p1 = new Pessoa(1, "Adalberto", 60);
		Pessoa p2 = new Pessoa(2, "Bernardo", 38);
		Pessoa p3 = new Pessoa(3, "Cezar", 26);
		Pessoa p4 = new Pessoa(4, "Daniel", 22);
		Pessoa p5 = new Pessoa(5, "Eduardo", 30);
		Pessoa p6 = new Pessoa(6, "Fernanda", 28);
		Pessoa p7 = new Pessoa(7, "Geraldo", 73);
		Pessoa p8 = new Pessoa(8, "Heitor", 40);
		Pessoa p9 = new Pessoa(9, "Ingrid", 35);
		Pessoa p10 = new Pessoa(10, "Jonas", 82);
		Pessoa p11 = new Pessoa(11, "Kelly", 31);

		banco.add(p1);
		banco.add(p2);
		banco.add(p3);
		banco.add(p4);
		banco.add(p5);
		banco.add(p6);
		banco.add(p7);
		banco.add(p8);
		banco.add(p9);
		banco.add(p10);
		banco.add(p11);

		// Testando essa tal de função lambda (tentei fazer isso no for each no case 1 mas não funciona)
		banco.forEach((p) -> {
			System.out.println(p.getNome());
		});

		int input;
		int opcao;

		while (true) {

			System.out.println(
					"Qual das opções deseja? \n 1. Verificar se uma pessoa está no cache \n 2. Mostrar o cache completo");
			opcao = scn.nextInt();

			switch (opcao) {

			case 1: {
				System.out.println("Digite o id da pessoa");
				input = scn.nextInt();

				for (Pessoa pessoa : banco) {
					if (pessoa.getId() == input) {

						if (cache.contains(pessoa)) {
							System.out.println("Pessoa encontrada no cache: " + pessoa.toString());

							break;
						} else {
							System.out.println("Pessoa buscada no banco e adicionada ao cache: " + pessoa.toString());
							if (cache.size() < 10) {
								cache.add(pessoa);
							} else {
								cache.removeFirst();
								cache.add(pessoa);
							}

							break;
						}

					} else {
						System.out.println("Id digitado é inválido");

						break;
					}

				}
				break;
			}
			case 2: {
				System.out.println(cache.toString());

				break;
			}
			default:
				System.out.println("Opção inválida");

				scn.close();
				break;
			}
		}

	}

}