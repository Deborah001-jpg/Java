package ExeFor;

import java.util.Scanner;

public class ExerFor {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

			
		        int numero;
		        int pares = 0;
		        int impares = 0;

		        System.out.println("Digite 10 números :");

		        for (int i = 0; i < 10; i++) {
		            System.out.print("Digite o número " + (i + 1) + ": ");
		            numero = leia.nextInt();

		            if (numero % 2 == 0) {
		                pares++;
		            } else {
		                impares++;
		            }
		        }

		        System.out.println("Quantidade de números pares: " + pares);
		        System.out.println("Quantidade de números ímpares: " + impares);

		    
		    }
		}
