package aula06;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
	
		Stack<String> pilha= new Stack<String>();
		
		
		// Collection Stack
		
		
		pilha.add("Aline");
		pilha.add("Pedro");
		pilha.add("Vini");
		pilha.add("Lui");
		pilha.push("Ma");
		
		System.out.println(pilha);
		
		pilha.pop();

		System.out.println(pilha);
		
		
		//Mostra o elemento que esta no topo da fila.
		System.out.println(pilha.peek());
		
		System.out.println(" A Aline está na pilha?" + pilha.contains("Aline"));
		
		
	}

}
