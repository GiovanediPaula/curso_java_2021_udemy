package encapsulamento;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preco: ");
		double preco = sc.nextDouble();

		Produto produto = new Produto(nome, preco);
		produto.setNome("Computador");
		
		System.out.println();    //salta uma linha
		
		System.out.println("Dados do Produto: " + produto);
		System.out.println();
		
		System.out.print("Digite o número de produtos a serem adicionados no Estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();   //salta uma linha
		
		System.out.println("Atualizar dados: " + produto);
		
		System.out.println();   //salta uma linha
		
		System.out.print("Insira o número de produtos a serem removidos do Estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println();    //salta uma linha
		
		System.out.println("Atualizar dados: " + produto);
		
		sc.close();
	}
}