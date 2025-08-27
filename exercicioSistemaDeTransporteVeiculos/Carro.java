package exercicioSistemaDeTransporteVeiculos;

public class Carro extends Veiculo{

	public Carro(String modelo) {
		super(modelo);
	}
	
	@Override
	public void calcularTempo (float distancia, int velocidade, float numeroParadas) {
		float tempo;
		distancia = 100;
		tempo = distancia / velocidade;
		
		// extraindo a parte decimal do tempo para converter em minutos
		int extratorDecimal;
		double parteDecimal;
		parteDecimal = tempo;
		extratorDecimal = (int) parteDecimal;
		parteDecimal = parteDecimal - extratorDecimal;		
		parteDecimal = parteDecimal * 60;
		
		System.out.println("O tempo para percorrer essa distância de Carro foi " + extratorDecimal + " horas e " + (String.format("%.0f", parteDecimal)) + " minutos");

	}
	
}
