package veiculos;

public class Carro extends Veiculo {

	public Carro(String nome) {
		super(nome);
	}
	
	@Override
	public void iniciar() {
		System.out.println("Carro está iniciando...");
	}
	
}
