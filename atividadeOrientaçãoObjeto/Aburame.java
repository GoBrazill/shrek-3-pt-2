package atividadeOrientaçãoObjeto;

public class Aburame extends Ninja{
	
	public Aburame(String nome, String vila, int idade, int insetos, String tiposInsetos) {
		super(nome, vila, idade);
		this.insetos = insetos;
		this.tiposInsetos = tiposInsetos;
	}

	private int insetos;
	private String tiposInsetos;
	
	void controlarInsetos() {
		
	}
	
	void usarInsetosParaEspionagem() {
		
	}

	public int getInsetos() {
		return insetos;
	}

	public void setInsetos(int insetos) {
		this.insetos = insetos;
	}

	public String getTiposInsetos() {
		return tiposInsetos;
	}

	public void setTiposInsetos(String tiposInsetos) {
		this.tiposInsetos = tiposInsetos;
	}
	
	
}
