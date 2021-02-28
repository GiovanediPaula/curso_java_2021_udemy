package treinamento.giovane;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = 10 / 8;   // divisão de numeros inteiros o resultado sempre vai ser inteiro
		double n5 = (double) 10 / 8;  //exemplo de divisão de número inteiro sem casas decimais com divisão de numeros double que tem um resultado maior de casas decimais.
		double n6 = 10.0 / 8.0;   //mesma situação do (double) que muda de inteiro com conta e resultado em varias casas decimais verificar tabela
		double n7 = (double) 17 % 3;
		
		double a = 1.0; 
		double b = -3.0;
		double c = -4.0;
		double x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
 		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(x1);
	}

}
