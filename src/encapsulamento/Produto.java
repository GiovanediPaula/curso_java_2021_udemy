package encapsulamento;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	//construtor padrao
	public Produto() {
	}
	
	//construtor - Nome, Preço e Quantidade
	public Produto(String nome, double preco, int quantidade) {     
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//construtor - Nome e Preço
	public Produto(String nome, double preco ) {
		this.nome = nome;
		this.preco = preco;		
	}

	//Get e Set  
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {  //deixa alterar o preco do produto
		this.preco = preco;
	}

	public int getQuantidade() {     //somente visualiza a quantidade do produto
		return quantidade;
	}

//	public void setQuantidade(int quantidade) {
//		this.quantidade = quantidade;
//	}

	//servicos
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