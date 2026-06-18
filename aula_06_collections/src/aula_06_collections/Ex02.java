package aula_06_collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> numeros = new TreeSet<Integer>(); // Para usar números inteiros usar o Integer, para ordenalos tem que colocar o TreeSet
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 0; 
		
		
		while( contador <=9 ) {
			contador ++; 
			System.out.println("Digite um número: ");
			numeros.add(leia.nextInt());
		}

		for(int num : numeros) {
			System.out.print(num + " ");
		}
		
		leia.close();

	}

}
