package aula06;

import java.util.HashSet;
import java.util.Scanner;

public class Ativ4Set {
	
	static Scanner leia = new Scanner(System.in);
	
	// Criar Set de Wrapper Integer e inicializar com 10 valores inteiros
	
	public static void main(String[] args) {
	
		HashSet<Integer> numerosSet = new HashSet<>();
		
		    numerosSet.add(2);
	        numerosSet.add(5);
	        numerosSet.add(1);
	        numerosSet.add(3);
	        numerosSet.add(4);
	        numerosSet.add(9);
	        numerosSet.add(7);
	        numerosSet.add(8);
	        numerosSet.add(10);
	        numerosSet.add(6);
		
	     // Solicitar ao usuário que digite um número inteiro
	        
	        
	        System.out.print("Digite um número: ");
	        int numeroDigitado = leia.nextInt();
		
	        

	}

}
