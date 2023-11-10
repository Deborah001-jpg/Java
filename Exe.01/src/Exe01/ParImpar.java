package Exe01;

import java.util.Scanner;

public class ParImpar {

	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
	
	
	
	int numero;
	
	System.out.printf("Digite um número:");
	numero = leia.nextInt();
	
	
	System.out.println();
	
	
	if((numero % 2) == 0 )
		System.out.printf("%d é um número Par \n", numero);
	else
		System.out.printf("%d é um número Impar \n",numero);
		
	if((numero <0) )
		System.out.printf("%d é um número Negativo \n", numero);
	else
		System.out.printf("%d é um número Positivo \n",numero);
	
	
	}

}
