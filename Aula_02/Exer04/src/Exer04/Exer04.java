package Exer04;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
	
		
		try (Scanner leia = new Scanner (System.in)) {
			
		
			float  numero1, numero2, numero3, numero4, resultado;
			
            System.out.println("Digite o 1 número:");
			numero1=leia.nextFloat();
			
			System.out.println("Digite o 2 número:");
			numero2=leia.nextFloat();
			
			System.out.println("Digite o 3 número:");
			numero3=leia.nextFloat();
			
			System.out.println("Digite o 4 número:");
			numero4=leia.nextFloat();
			
			resultado= (numero1 * numero2 )-(numero3 * numero4);
		
		    System.out.println("A diferença é: "+ resultado);
	
		    
		}  
        
        
        
	}

}
