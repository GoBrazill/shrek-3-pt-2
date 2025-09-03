package exercicioSistemaDeTransporteVeiculos;

public class Veiculo {
	
	private String modelo;	
	
	public Veiculo(String modelo) {
		super();
		this.modelo = modelo;
	}
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void calcularTempo (float distancia, int velocidade, float numeroParadas) {
		// tempo = distância / velocidade
		float tempo;
		distancia = 100;
		tempo = distancia / velocidade;
	}

}
