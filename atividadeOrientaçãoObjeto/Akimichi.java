package atividadeOrientaçãoObjeto;

public class Akimichi extends Ninja{
	
	public Akimichi(String nome, String vila, int idade, boolean modoGigante) {
		super(nome, vila, idade);
		this.modoGigante = modoGigante;
	}

	private boolean modoGigante;
	
	void aumentarTamanhoCorpo() {
		
	}

	public boolean isModoGigante() {
		return modoGigante;
	}

	public void setModoGigante(boolean modoGigante) {
		this.modoGigante = modoGigante;
	}
	
	
}
