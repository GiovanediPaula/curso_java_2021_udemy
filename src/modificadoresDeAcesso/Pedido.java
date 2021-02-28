package modificadoresDeAcesso;

import java.util.Date;

public class Pedido {
	
	private Date dataPedido;
	private Produto produto;
	
	public Pedido(Date dataPedido, Produto produto) {
		this.dataPedido = dataPedido;
		this.produto = produto;
	}
	
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	

}
