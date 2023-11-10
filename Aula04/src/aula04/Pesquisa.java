package aula04;

import java.util.Scanner;

public class Pesquisa {

	
	static Scanner leia= new Scanner (System.in);
	
	public static void main(String[] args) {
		
       int idade = 0, esporte, futebol= 0, voleibolM18= 0, basquetMen18 = 0, Outros =0;
      String continua = "s";
       
       
          while (continua.equalsIgnoreCase("s")) {
	
	      System.out.println("digite sua idade:");
        	idade = leia.nextInt();
	      
	      do {
	      System.out.println("digite seu esporte favorito (1-Fut/2-vol/3- basqt/ 4- outros:");  
	     esporte= leia.nextInt();
	     
	     
	     
	      }while (esporte <1 || esporte > 4);
	  
	   
	     //Quantas pessoas gostam do Fut
	     if(esporte ==1 && idade > 18)
	    	 futebol ++;
	  
	     
	     //Quantas pessoas gostam do Vol e são maiores.
	     if(esporte ==2 && idade > 18)
	    	 voleibolM18 ++;
	     
	   //Quantas pessoas gostam do Basquet e são menores.
	     if(esporte ==3 && idade < 18)
	    	 basquetMen18 ++;
	     
	     //Quantas pessoas gostam de outros.
	     if(esporte ==4 )
	    	 Outros ++;
	
	     System.out.println("Deseja continuar (s/n)?");
	     leia.skip("\\R");
	     continua = leia.nextLine().toUpperCase();
	     
	    System.out.println("Total de pessoas que gostam de futebol:" + futebol);
	    System.out.println("Total de pessoas que gostam de Voleibol e são maiores de 18 anos:" + voleibolM18);
	    System.out.println("Total de pessoas que gostam de basquetebol:" + basquetMen18); 
	    System.out.println("Total de pessoas que gostam de futebol:" + Outros); 
	     
}
		
		
		
		
	}

}
