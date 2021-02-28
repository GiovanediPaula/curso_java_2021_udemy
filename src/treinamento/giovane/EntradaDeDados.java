package treinamento.giovane;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();    //captura o valor da tela
		
//		int x = sc.nextInt();
//		double y = sc.nextDouble();
//		String z = sc.next();
		
		String x, y, z;
		x = sc.next();          //libera a tela para digitar o valor de x 
		y = sc.next();			//libera a tela para digitar o valor de x 
		z = sc.next();			//libera a tela para digitar o valor de x 
		
		System.out.println(sentence);       //imprime o valor digitado na tela
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		x = sc.next();       //também le intervalo de palavras
		y = sc.next();
		z = sc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();
	}

}
