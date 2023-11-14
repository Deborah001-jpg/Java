package ExeWhile;

import java.util.Scanner;

public class ExeWhile {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {


		int idade = 1, menores21 = 0, maiores50 = 0;

		System.out.println("Digite a idade:");
		idade= leia.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				menores21++;
			} else {
				
				if (idade > 50) {
				maiores50++;
				}
				
			}
			
				System.out.println("Total de pessoas com idade menor que 21 anos: " + menores21);
				System.out.println("Total de pessoas com idade maior que 50 anos: " + maiores50);
			
				
				
		}
	}
}
			
		
