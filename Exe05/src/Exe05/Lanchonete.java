package Exe05;

import java.util.Scanner;

public class Lanchonete {

	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
	
		
	
		String produto;
		int quantidade, codigo;
		
		float valor = (float) 2.0897667; 
		
		 System.out.println("Olá escolha seu lanche!");
		
			System.out.println("1- Cachorro Quente R$ 10,00");
			System.out.println("2- X-Salada R$ 15,00");
			System.out.println("3- X-Bacon R$ 18,00");
			System.out.println("4- Bauru R$ 12,00");
			System.out.println("5- Refrigerante R$ 8,00");
			System.out.println("6- Suco de Laranja R$ 13,00");
		 
		
		
		System.out.print("Digite o código do produto:\n");
		produto = leia.nextLine();
		
		System.out.print("Digite a quantidade:\n");
		quantidade = leia.nextInt();
		
		
		System.out.println("Produto: " + codigo);
		System.out.printf("Valor total: R$ %.2f", quantidade*valor);
		
		
		switch(codigo) {
		case 1:
			System.out.printf("\n%s Cachorro Quente");
			valor = 10.00f;
		break;
		
		case 2:
			System.out.printf("\n%s X-salada");
			valor = 15.00f;
		break;
		case 3:
			System.out.printf("\n%s X-Bacon");
			valor = 18.00f;		
			break;
		case 4:
			System.out.printf("\n%s X-Bauru");
			valor = 12.00f;		
		break;
		case 5:
			System.out.printf("\n%s Refrigerante");
			valor = 08.00f;	
		break;
		case 6:
			System.out.printf("\n%s Suco de Laranja");
			valor = 13.00f;	
			break;
		
	

		
		
		
		}
		
		
	}
	
	
}
		
		
	


	
