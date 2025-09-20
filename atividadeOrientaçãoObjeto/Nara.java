package atividadeOrientaçãoObjeto;

public class Nara extends Ninja{
	
	public Nara(String nome, String vila, int idade, boolean controleSombra, int inteligencia) {
		super(nome, vila, idade);
		this.controleSombra = controleSombra;
		this.inteligencia = inteligencia;
	}

	private boolean controleSombra;
	private int inteligencia;
	
	void usarTecnicaSombra(String ninjaAlvo) {
		
	}
	
	void planejarEstrategiaCombate() {
		
	}
	
	public boolean isControleSombra() {
		return controleSombra;
	}

	public void setControleSombra(boolean controleSombra) {
		this.controleSombra = controleSombra;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

}
