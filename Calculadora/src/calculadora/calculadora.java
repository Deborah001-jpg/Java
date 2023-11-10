package calculadora;


import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
	
		try (Scanner leia = new Scanner (System.in)) {
			double numero1, numero2;
			
			System.out.println("Digite o primeiro:");
			numero1 = leia.nextDouble();
			
			System.out.println("Digite o segundo numero:");
			numero2 = leia.nextDouble();
			
			System.out.println("Soma:" + (numero1 + numero2));
			System.out.println("Subtração:" + (numero1 - numero2));
			System.out.println("Multiplicação:" + (numero1 * numero2));
			
		//Condição para divisão
			
			if(numero2 > 0) {
				
			System.out.println("Divisão:" + (numero1 / numero2));
			
			} else {
				System.out.println("Não existe divisão por zero");
			}
			
			System.out.println("Módulo do numero 1 (resto da divisão):" + numero1 % numero2);
		}
		
        
		
		
		
	}

}
