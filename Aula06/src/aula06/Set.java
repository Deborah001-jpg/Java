package aula06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		
		HashSet<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");
		//frutas.add(null);
		
		System.out.println(frutas);
		
		
		for(var fruta: frutas)
			System.out.println(fruta.hashCode());
		
		System.out.println(" A fruta morango existe?" + frutas.contains("Morango"));
		
		frutas.remove("Morango");
		
		System.out.println(frutas);
		
		
		Iterator<String>ifrutas = frutas.iterator();
		
		
		while(ifrutas.hasNext())
		System.out.println(ifrutas.next());
		
		//criamos o ArrayList
		
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//adicionamos todos os elementos da colecao hashset
		
		frutasList.addAll(frutas);
		//ordenamos elementos em ordem crescente
		
		frutasList.sort(null);
		
		//ordemos em ordem descrecente
		frutasList.sort(Comparator.reverseOrder());
		
		
		System.out.println(frutasList);
		
		
		
	}

}
