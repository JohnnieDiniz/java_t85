package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CollectionPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Amarelo");
		pilha.push("Branco");
		pilha.push("Laranja");
		
		pilha.pop(); // remove o ultimo elemento da pilha 		
		System.out.println("A sara está na pilha? " + pilha.contains("Azul"));
		
		for(var cores : pilha) {
			System.out.println(cores);
		}
		
		
		
		leia.close();

	}

}
