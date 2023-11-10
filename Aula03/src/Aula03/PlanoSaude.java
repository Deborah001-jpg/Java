package Aula03;

import java.util.Scanner;

public class PlanoSaude {

	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		
		String nome;
		int idade;
		
		System.out.print("Digite o seu nome:");
		nome = leia.nextLine();
		
		System.out.print("\nDigite o sua idade:");
		idade = leia.nextInt();
		
		if(idade >= 0 && idade <= 10 ) {	
			System.out.printf("%s O seu plano de Saúde custara 100,00", nome);
		
		}else if(idade >= 11 && idade <= 29) {
			System.out.printf("%s O seu plano de Saúde custara 200,00", nome);	
		}else if(idade >= 30 && idade <= 45) {	
			System.out.printf("%s O seu plano de Saúde custara 300,00", nome);
		}else if(idade >= 45 && idade <= 59) {	
			System.out.printf("%s O seu plano de Saúde custara 500,00", nome);
		}else if(idade >= 59 && idade <= 65) {	
			System.out.printf("%s O seu plano de Saúde custara 600,00", nome); 
		}else {
			System.out.printf("%s O seu plano de Saúde custara 1000,00", nome); 
			
			
			
			

		}
		

	}

}
