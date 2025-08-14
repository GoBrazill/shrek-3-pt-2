package herancaEletroDomesticos;

public class Batedeira extends EletroDomestico {
	
	private int velocidade;
	
	public Batedeira(String nome, String cor, int tensao, int preco, int velocidade) {
		super(nome, cor, tensao, preco);
		this.velocidade = velocidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
