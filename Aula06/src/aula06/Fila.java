package aula06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> Fila = new LinkedList<String>();

		
		// Collection Queue
		
		
		Fila.add("Aline");
		Fila.add("Pedro");
		Fila.add("Vini");
		Fila.add("Lui");
		Fila.add("Ma");

		System.out.println(Fila);

		System.out.println(Fila.peek());

		System.out.println(Fila);

		System.out.println(Fila.poll());

		System.out.println(Fila);

		System.out.println("A Maria está na fila?:" + Fila.contains("Maria"));

		System.out.println("Numero de elementos na fila:" + Fila.size());

		
		
		
		
		
		
	}

}
