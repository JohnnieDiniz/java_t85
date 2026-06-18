package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CollectionArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		numeros.add(9);
		
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		System.out.printf("O objeto que está presente no indice 1: %d ", numeros.get(1)); // pega o valor da posição 
		System.out.printf("\nO indice do objeto 1 1: %d ", numeros.indexOf(1)); // pega a posição do valor 
		
		numeros.set(3, 25);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		numeros.remove(0);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		
		numeros.sort(null);
		numeros.sort(Comparator.reverseOrder());
		leia.close();

	}

}
