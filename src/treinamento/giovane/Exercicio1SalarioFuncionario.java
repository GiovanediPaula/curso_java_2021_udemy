package treinamento.giovane;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1SalarioFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = (horasTrabalhadas * valorHora);
		
		System.out.println("NUMERO = " + numeroFuncionario);		
		System.out.printf("SALARIO = U$ %.2f%n", salario);
		
		sc.close();

	}
	
}
