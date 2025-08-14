package herancaEletroDomesticos;

public class MicroOndas extends EletroDomestico {

	private boolean temDisplay;
	private boolean temLuz;
	
	public MicroOndas(String nome, String cor, int tensao, int preco, boolean temDisplay, boolean temLuz) {
		super(nome, cor, tensao, preco);
		this.temDisplay = temDisplay;
		this.temLuz = temLuz;
	}
	
	public boolean isTemDisplay() {
		return temDisplay;
	}
	public void setTemDisplay(boolean temDisplay) {
		this.temDisplay = temDisplay;
	}
	public boolean isTemLuz() {
		return temLuz;
	}
	public void setTemLuz(boolean temLuz) {
		this.temLuz = temLuz;
	}
	
	
	
	
}
