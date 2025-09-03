package exercicioSistemaDeTransporteVeiculos;

public class Onibus extends Veiculo{
	
	private int numeroParadas;

	public Onibus(String modelo, int numeroParadas) {
		super(modelo);
		this.numeroParadas = numeroParadas;
	}

	public int getNumeroParadas() {
		return numeroParadas;
	}

	public void setNumeroParadas(int numeroParadas) {
		this.numeroParadas = numeroParadas;
	}
	
	@Override
	public void calcularTempo (float distancia, int velocidade, float numeroParadas) {
		float tempo;
		distancia = 100;
		tempo = distancia / velocidade;
		
		numeroParadas = numeroParadas * 15;
		numeroParadas = numeroParadas / 60;
		tempo = tempo + numeroParadas;
		
		int extratorDecimal;
		double parteDecimal;
		parteDecimal = tempo;
		extratorDecimal = (int) parteDecimal;
		parteDecimal = parteDecimal - extratorDecimal;	
		parteDecimal = parteDecimal * 60;
		
		System.out.println("O tempo para percorrer essa distância de Ônibus foi " + extratorDecimal + " horas e " + (String.format("%.0f", parteDecimal)) + " minutos");
	}
	
	
}
