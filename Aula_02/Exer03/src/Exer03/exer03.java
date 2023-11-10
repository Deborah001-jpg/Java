package Exer03;

import java.util.Scanner;

public class exer03 {

		static Scanner leia = new Scanner (System.in);
		
		public static void main(String[] args) {

			float bruto, addnoturno, horaextra,desconto,liquido;
		

			System.out.println("Digite o salário bruto:");
			bruto = (float) leia.nextDouble();
			
			System.out.println("Digite o Adicional Noturno:");
			addnoturno = (float) leia.nextDouble();
			
			System.out.println("Digite a hora extra:");
			horaextra = (float) leia.nextDouble();
			
			System.out.println("Digite o Descontos:");
			desconto = (float) leia.nextDouble();
			
			 liquido =(bruto + addnoturno + (horaextra*5)-desconto);
			
			 System.out.println("Salário Liquido é "+ liquido);
	}

}
