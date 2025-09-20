package atividadeOrientaçãoObjeto;

public class Uchirra extends Ninja{
	
	public Uchirra(String nome, String vila, int idade, boolean possuiSharingan, int nivleSharingan,
			int afinidadeFogo) {
		super(nome, vila, idade);
		this.possuiSharingan = possuiSharingan;
		this.nivleSharingan = nivleSharingan;
		this.afinidadeFogo = afinidadeFogo;
	}

	private boolean possuiSharingan;
	private int nivleSharingan;
	private int afinidadeFogo;
	
	void ativarSharingan() {
		
	}
	
	void copiarJutsu(String ninjaAlvo) {
		
	}
	
	void usarAmaterasu() {
		
	}
	
	public boolean isPossuiSharingan() {
		return possuiSharingan;
	}

	public void setPossuiSharingan(boolean possuiSharingan) {
		this.possuiSharingan = possuiSharingan;
	}

	public int getNivleSharingan() {
		return nivleSharingan;
	}

	public void setNivleSharingan(int nivleSharingan) {
		this.nivleSharingan = nivleSharingan;
	}

	public int getAfinidadeFogo() {
		return afinidadeFogo;
	}

	public void setAfinidadeFogo(int afinidadeFogo) {
		this.afinidadeFogo = afinidadeFogo;
	}

}
