package aula_06_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Set<String> frutas = new HashSet<String>();
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Banana", "Pêra")); // adiciona vários elementos em uma collection hashset
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maçã");
		frutas.add("Abacate");
		frutas.add("Laranja");
		
		frutas.addAll(listaFrutas);
		frutas.remove("Laranja");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		System.out.println("A fruta laranja está presente? "+ frutas.contains("Laranja"));
		
		
		
		leia.close();

	}

}
