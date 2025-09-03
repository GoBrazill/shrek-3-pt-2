package exercicioSistemaDeTransporteVeiculos;

public class Bicicleta extends Veiculo{

	public Bicicleta(String modelo) {
		super(modelo);
	}
	
	@Override
	public void calcularTempo (float distancia, int velocidade, float numeroParadas) {
		float tempo;
		distancia = 100;
		tempo = distancia / velocidade;
		
		int extratorDecimal;
		double parteDecimal;
		parteDecimal = tempo;
		extratorDecimal = (int) parteDecimal;
		parteDecimal = parteDecimal - extratorDecimal;	
		parteDecimal = parteDecimal * 60;
		
		System.out.println("O tempo para percorrer essa distância da Bicicleta foi " + extratorDecimal + " horas e " + (String.format("%.0f", parteDecimal)) + " minutos");

	}
	
}
