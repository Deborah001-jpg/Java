package exewhiledo;

import java.util.Scanner;

public class ExeWhileDo {

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero;
		int soma = 0;

		System.out.println("Digite 1 número (Digite 0 para encerrar):");

		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();

			if (numero > 0) {
				soma += numero;
			}

		} while (numero != 0);

		System.out.println("A soma dos números positivos digitados é: " + soma);

	
	}

}
