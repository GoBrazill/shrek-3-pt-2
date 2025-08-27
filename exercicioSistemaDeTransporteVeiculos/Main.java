package exercicioSistemaDeTransporteVeiculos;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Corsa");
		Bicicleta bicicleta = new Bicicleta("Mickey Nathor");
		Onibus onibus = new Onibus("LO 916", 2);
		
		carro.calcularTempo(100, 80, 0);
		bicicleta.calcularTempo(100, 20, 0);
		onibus.calcularTempo(100, 60, onibus.getNumeroParadas());

	}

}
