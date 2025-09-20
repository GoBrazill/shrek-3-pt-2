package atividadeOrientaçãoObjeto;

public class Senju extends Ninja{
	
	public Senju(String nome, String vila, int idade, boolean afinidadeMaeira, int controleChakra) {
		super(nome, vila, idade);
		this.afinidadeMaeira = afinidadeMaeira;
		this.controleChakra = controleChakra;
	}

	private boolean afinidadeMaeira;
	private int controleChakra;
	
	void regenerar() {
		
	}

	public boolean isAfinidadeMaeira() {
		return afinidadeMaeira;
	}

	public void setAfinidadeMaeira(boolean afinidadeMaeira) {
		this.afinidadeMaeira = afinidadeMaeira;
	}

	public int getControleChakra() {
		return controleChakra;
	}

	public void setControleChakra(int controleChakra) {
		this.controleChakra = controleChakra;
	}
	
	
}
