package atividadeOrientaçãoObjeto;

public class Hyugga extends Ninja{

	public Hyugga(String nome, String vila, int idade, boolean possuiByakugan, int nivelByakugan,
			boolean estiloGentleFist) {
		super(nome, vila, idade);
		this.possuiByakugan = possuiByakugan;
		this.nivelByakugan = nivelByakugan;
		this.estiloGentleFist = estiloGentleFist;
	}

	private boolean possuiByakugan;
	private int nivelByakugan;
	private boolean estiloGentleFist;
	
	void ativarByakugan() {
		
	}
	
	void usarRotacaoDefensiva() {
		
	}

	public boolean isPossuiByakugan() {
		return possuiByakugan;
	}

	public void setPossuiByakugan(boolean possuiByakugan) {
		this.possuiByakugan = possuiByakugan;
	}

	public int getNivelByakugan() {
		return nivelByakugan;
	}

	public void setNivelByakugan(int nivelByakugan) {
		this.nivelByakugan = nivelByakugan;
	}

	public boolean isEstiloGentleFist() {
		return estiloGentleFist;
	}

	public void setEstiloGentleFist(boolean estiloGentleFist) {
		this.estiloGentleFist = estiloGentleFist;
	}
	
}
