package contabancaria;

// number - numero
// holder - titular
// balance - saldo
// amount - extrato

public class Conta {

	private int numero;
	private String titular;
	private double saldo;

	// Construtor com Numero da Conta e Nome titular
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	// Construtor com Numero da Conta, Nome do Titular e saldo
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	// Construtor com Numero da Conta, Nome do Titular e valor deposito inicial
//	public Conta(int numero, String titular, double depositoInicial) {
//		this.numero = numero;
//		this.titular = titular;
//		deposito(depositoInicial);
//	}

	// Gettin and Setings
	public int getNumero() {
		return numero;
	}

//  Numero da conta não pode ser apagado
//	public void setNumero(int numero) {
//		this.numero = numero;
//	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

//  Numero da conta não pode ser apagado
//	public void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}

	// operacoes
//	public void Numero(int numero) {
//		this.numero = numero;
//	}
//
//	public void Titular(String titular) {
//		this.titular = titular;
//	}

	public void Deposita(double extrato) {
		this.saldo += extrato;
	}

	public void sacar(double extrato) {
		this.saldo -= extrato + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ numero
				+ ", Titular: "
				+ titular
				+ ", saldo: R$ "
				+ String.format("%.2f", saldo);
	} 

}
