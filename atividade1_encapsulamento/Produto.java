package atividade1_encapsulamento;

public class Produto {
	
	private String nome;
	private Double preco;
	
	public String getNome() {
		return nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void aplicarDesconto(double precoOriginal) {
		preco = preco - (precoOriginal * 10 / 100);
	}
	
	
}
