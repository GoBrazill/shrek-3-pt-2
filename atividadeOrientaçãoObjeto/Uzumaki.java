package atividadeOrientaçãoObjeto;

public class Uzumaki extends Ninja{
	
	public Uzumaki(String nome, String vila, int idade, boolean temChakraEspecial, boolean temTecnicaSelamento) {
		super(nome, vila, idade);
		TemChakraEspecial = temChakraEspecial;
		this.temTecnicaSelamento = temTecnicaSelamento;
	}

	private boolean TemChakraEspecial;
	private boolean temTecnicaSelamento;
	
	void usarTecnicaSelamento() {
		
	}
	
	void regenerar() {
		
	}

	public boolean isTemChakraEspecial() {
		return TemChakraEspecial;
	}

	public void setTemChakraEspecial(boolean temChakraEspecial) {
		TemChakraEspecial = temChakraEspecial;
	}

	public boolean isTemTecnicaSelamento() {
		return temTecnicaSelamento;
	}

	public void setTemTecnicaSelamento(boolean temTecnicaSelamento) {
		this.temTecnicaSelamento = temTecnicaSelamento;
	}
	
	
}
