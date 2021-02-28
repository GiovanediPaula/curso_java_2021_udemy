package sobrecarga;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	//construtor obrigar a digitar os dados
	public Produto(String nome, double preco, int quantidade) {     
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double totalValueInStock() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome 
				+ ", R$ " 
				+ String.format("%.2f", preco) 
				+ ", " + quantidade + " unidade, Total: R$ "
				+ String.format("%.2f", totalValueInStock());
	}
}