package treinamento.giovane;

import java.util.Locale;

public class ComandoPrint {
	
	public static void main(String[] args) {
	
	String produto1 = "Computador";
	String produto2 = "Mesa de Trabalho";
	
	byte idade = 30;
	int codigo = 5290;
	char genero = 'M';
	
	double preco1 = 2100.0;
	double preco2 = 650.50;
	double medida = 53.234567;
	
	System.out.println("Produtos:");
	System.out.printf("%s, cujo preço é de $ %.2f%n", produto1, preco1);
	System.out.printf("%s, cujo preço é de $ %.2f%n", produto2, preco2);
	System.out.println();
	System.out.printf("Registro: %d anos de idade, código %d e genero: %c%n", idade, codigo, genero);
	System.out.println();
	System.out.printf("Mede com oito casas decimais: %.8f%n", medida);
	System.out.printf("Mede (três casas decimais): %.3f%n", medida);
	Locale.setDefault(Locale.US);
	System.out.printf("Ponto decimal dos EUA: %.3f%n", medida);
	
	}
			
}
