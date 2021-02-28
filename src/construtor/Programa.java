package construtor;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Produto produto = new Produto();

//		System.out.println(produto.nome);
//		System.out.println(produto.preco);
//		System.out.println(produto.quantidade);
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println();    //salta uma linha
		
		System.out.println("Dados do Produto: " + produto);
		System.out.println();
		
		System.out.print("Digite o número de produtos a serem adicionados no Estoque: ");
		quantidade = sc.nextInt();
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