package atividade04;

import java.util.Scanner;

public class Matriz04 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		float [][] notas = new float [10][4];
		float [] medias = new float [2];
		float soma= 0.0f;
		
		for(int indiceI = 0 ; indiceI < notas.length; indiceI ++) {
			for( int indiceJ =0; indiceJ <notas[indiceI].length; indiceJ ++) {
			soma += notas[indiceI][indiceJ];
				
			}
			
			medias[indiceI]= soma / notas[indiceI].length;
			soma= 0.0f;
			
		}
		
		for(int indice = 0; indice < medias.length; indice ++)
			System.out.println("\nMedia do participante" + (indice + 1) + ":" + medias[indice]);
		

	}

}
