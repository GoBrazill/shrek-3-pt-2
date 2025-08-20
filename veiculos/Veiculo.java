package veiculos;

public class Veiculo {

	private String nome;
	
	public void iniciar() {
		System.out.println("Veículo está iniciando...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Veiculo(String nome) {
		super();
		this.nome = nome;
	}
	
	
}
