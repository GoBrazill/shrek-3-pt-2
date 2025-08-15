package atividade_2_Encapsulamento;

public class Exercicio04 {

	public static void main(String[] args) {

		PersonagemRPG personagem = new PersonagemRPG();

		personagem.setNome("Vini");
		personagem.setClasse("Bárbaro");
		personagem.setNivel(1);
		personagem.setVida(75);

		System.out.println("Nome: " + personagem.getNome() + " \nClasse: " + personagem.getClasse() + " \nNível: "
				+ personagem.getNivel() + " \nVida: " + personagem.getVida());

	}

}