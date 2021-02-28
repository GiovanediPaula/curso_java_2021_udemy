package OperadoresLogicos;

public class OperadoresLogicos {
	
	public static void main(String[] args){
		
		boolean c1 = 2 > 3 ;
		boolean c2 = 2 > 3 || 4 != 5;
		boolean c3 = !(2 > 3) && 4 != 5;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("-------------");
		
		boolean c4 = 10 < 5;  //false
		boolean c5 = c1 || c2 && c3;
		
		System.out.println(c4);
		System.out.println(c5);
		
	}

}
