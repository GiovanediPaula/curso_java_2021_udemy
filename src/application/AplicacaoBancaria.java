package application;

import java.util.Locale;
import java.util.Scanner;

import contabancaria.Conta;

public class AplicacaoBancaria {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//
		Conta conta;

		//numero da conta
		System.out.print("Digite o numero da conta: ");  //informações do menu da tela
		int numero = sc.nextInt();  //guardar valor em uma variavel temporaria
		
		//nome do titular
		System.out.print("Digite o numero do titular: ");  //informações do menu da tela
		sc.nextLine();  //consumir quebra de linha pendente anterior
		String titular = sc.nextLine();  //guardar valor em uma variavel temporaria
		
		//pergunta tem deposito inicial
		System.out.print("Tem deposito inicial (S/N)? ");
		char resposta = sc.next().charAt(0);

		if  (resposta == 'S') {
			System.out.println("Digite o valor inicial do deposito ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);  //iniciar construtor com Nome, titular e deposito inicial
		}

		else {
			conta = new Conta(numero, titular);   //inicia o construtor so com o numero e titular
		}
		
		//Pular uma linha
		System.out.println();
		
		//Listar dados da conta
		System.out.println("Atualizar dados da conta: ");
		System.out.println(conta);
		
		//digitar o valor do deposito
		System.out.println();
		System.out.print("Digite o valor do deposito ");
		double depositoValor = sc.nextDouble();
		conta.Deposita(depositoValor);
		
		//Listar dados da conta
		System.out.println("Atualizar dados da conta ");
		System.out.println(conta);
		
		//digitar o valor do Saque
		System.out.println();
		System.out.print("Digite o valor do saque ");
		double sacarValor = sc.nextDouble();
		conta.sacar(sacarValor);
		
		//Listar dados da conta
		System.out.println("Atualizar dados da conta ");
		System.out.println(conta);
		
		sc.close();
	
	}

}
