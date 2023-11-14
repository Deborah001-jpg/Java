package atividade03;

import java.util.Scanner;

public class Matrizes {

	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	

		        // Inicialização da matriz 3x3
		        int[][] matriz = new int[3][3];

		        // Leitura da matriz 3x3
		        System.out.println("Digite os elementos da matriz 3x3:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print("Matriz[" + (i + 1) + "][" + (j + 1) + "]: ");
		                matriz[i][j] = new Scanner(System.in).nextInt();
		            }
		        }

		        // Exibir todos os elementos da Diagonal Principal
		        System.out.println("\nElementos da Diagonal Principal:");
		        for (int i = 0; i < 3; i++) {
		            System.out.println(matriz[i][i]);
		        }

		        // Exibir todos os elementos da Diagonal Secundária
		        System.out.println("\nElementos da Diagonal Secundária:");
		        for (int i = 0; i < 3; i++) {
		            System.out.println(matriz[i][2 - i]);
		        }

		        // Calcular a soma de todos os elementos da Diagonal Principal
		        int somaDiagonalPrincipal = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalPrincipal += matriz[i][i];
		        }
		        System.out.println("\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);

		        // Calcular a soma de todos os elementos da Diagonal Secundária
		        int somaDiagonalSecundaria = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalSecundaria += matriz[i][2 - i];
		        }
		        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
		    }
		

		    }

		    
		
		


