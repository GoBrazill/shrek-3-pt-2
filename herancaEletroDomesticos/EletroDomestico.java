package herancaEletroDomesticos;

public class EletroDomestico {
	
	private String nome;
	private String cor;
	private int tensao;
	private int preco;
	
	public EletroDomestico(String nome, String cor, int tensao, int preco) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.tensao = tensao;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getTensao() {
		return tensao;
	}
	
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	public int getPreco() {
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
}
