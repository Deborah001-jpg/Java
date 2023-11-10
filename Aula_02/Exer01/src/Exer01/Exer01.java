package Exer01;

import java.util.Scanner;

public class Exer01 {

	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {		
	
		float valor1 = 2.456789f;
		float valor2 = 2.456789f;
	
		
		System.out.print("Digite o salário:");	
	valor1  = leia.nextInt();
	System.out.print("Digite o Abono:");
	valor2  = leia.nextInt();	

	System.out.println("Novo salário é igual a:" + (valor1 + valor2));
	
	
	
	}

}
