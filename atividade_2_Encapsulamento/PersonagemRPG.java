package atividade_2_Encapsulamento;

public class PersonagemRPG {
	
	private String nome, classe;
	private int nivel, vida;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public void setNivel(int nivel) {
		nivel = 1;
		
		if (nivel < 1) {
			System.out.println("O nível tem que ser maior do que 0");
			return;
		}
		
		this.nivel = nivel;	
	}
	
	
	public String getNome() {
		return nome;
	}

	public String getClasse() {
		return classe;
	}

	public int getNivel() {
		return nivel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
		
		if (vida <= 0) {
			System.out.println("Você está morto ;-;");
			return;
		} else if (vida >= 100) {
			System.out.println("Quantidade de vida inválida! Sua vida foi zerada!");
			this.vida = 0;
			return;
		}
		
	}
	
}