package treinamento.giovane;

public class OperadoresAtribuicao {

	public static void main(String[] args) {

		double n1 = 10;     // = é o perador de atribuição
		double n2 = 30;
		String s = "ABC";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("-------------------------");
		
		n1 *= 2;  //20
		n2 += n1;  //50
		s += "DEF";   // união de strings
				
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
	
	}

}
