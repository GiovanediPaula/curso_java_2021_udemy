package modificadoresDeAcesso;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	//Construtor padrao
	public Produto() {
	}
	//Construtor completo
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	//Construtor Nome e Preco	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
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