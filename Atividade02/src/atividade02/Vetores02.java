package atividade02;

import java.util.Scanner;

public class Vetores02 {

	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		
		        // Inicialização do vetor
		        int[] vetor = new int[10];

		        // Leitura dos 10 números inteiros e armazenamento no vetor
		        for (int i = 0; i < 10; i++) {
		            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
		            vetor[i] = new Scanner(System.in).nextInt();
		        }

		        // Exibir todos os elementos dos índices ímpares
		        
		        System.out.println("\nElementos dos índices ímpares:");
		        for (int i = 1; i < vetor.length; i += 2) {
		            System.out.println(vetor[i]);
		        }

		        // Exibir todos os elementos do vetor que são números pares
		        
		        System.out.println("\nElementos pares:");
		        for (int num : vetor) {
		            if (num % 2 == 0) {
		                System.out.println(num);
		            }
		        }

		        // Calcular a soma de todos os elementos do vetor
		        
		        int soma = 0;
		        for (int num : vetor) {
		            soma += num;
		        }
		        System.out.println("\nSoma de todos os elementos: " + soma);

		        // Calcular a média de todos os elementos do vetor
		        
		        double media = (double) soma / vetor.length;
		        System.out.println("Média de todos os elementos: " + media);
		    }
		
	

	}

