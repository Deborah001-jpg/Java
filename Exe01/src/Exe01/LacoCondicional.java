package Exe01;

import java.util.Scanner;

public class LacoCondicional {

	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		
		
		System.out.println("Digite o numero a:");
		a = leia.nextInt();
	
		System.out.println("Digite o numero b:");
		b = leia.nextInt();
		
		System.out.println("Digite o numero c:");
		c = leia.nextInt();
		
		if((a + b > c))
			System.out.printf("A soma é maior que  c " );
	
		if((a + b < c))
			System.out.printf("A soma é menor que  c " );
		
		if((a + b == c))
			System.out.printf("A soma é igual a c ");
		
		
		
	
	}

}
