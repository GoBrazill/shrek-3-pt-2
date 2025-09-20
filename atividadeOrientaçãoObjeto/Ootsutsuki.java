package atividadeOrientaçãoObjeto;

public class Ootsutsuki extends Ninja{
	
	public Ootsutsuki(String nome, String vila, int idade, boolean temKekeigenkai) {
		super(nome, vila, idade);
		this.temKekeigenkai = temKekeigenkai;
	}

	private boolean temKekeigenkai;
	
	void ativarShikotsumyaku() {
		
	}
	
	void ataqueOsseo() {
		
	}
	void defesaOssea() {
		
	}

	public boolean isTemKekeigenkai() {
		return temKekeigenkai;
	}

	public void setTemKekeigenkai(boolean temKekeigenkai) {
		this.temKekeigenkai = temKekeigenkai;
	}
	
	
}
