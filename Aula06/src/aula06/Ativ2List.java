package aula06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ2List {
	 // Criar ArrayList de Wrapper Integer e inicializar com 10 valores inteiros
	
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
	ArrayList<Integer> numero = new ArrayList <Integer>();
 
 
    
    numero.add(2);
	numero.add(5);
	numero.add(1);
	numero.add(3);	
	numero.add(4);	
	numero.add(9);	
	numero.add(7);	
	numero.add(8);	
	numero.add(10);
	numero.add(6);

    
 // Solicitar ao usuário que digite um número inteiro

	  System.out.print("Digite um número inteiro: ");
      int numeroDigitado = leia.nextInt();
	
	//Exibir a posição na ArrayList
      
      
      if (numero.contains(numeroDigitado)) {
          int posicao = numero.indexOf(numeroDigitado);
          System.out.println("O número " + numeroDigitado + " foi encontrado na posição " + posicao);
      } else {
          System.out.println("O número " + numeroDigitado + " não foi encontrado ");
	

	
	
      }
	
	}
	
	}
