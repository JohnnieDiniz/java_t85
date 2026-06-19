package atividade_pratica_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Queue<Integer> valores = new LinkedList<Integer>(); // estou usando a collection set pensando em números não repetidos.
		
		Scanner leia = new Scanner(System.in);
		int soma = 0;
		int maior = Integer.MIN_VALUE; 
		for (int contador = 0; contador < 5; contador ++) {
			System.out.println("\nDigite um número:  ");
			int numero = leia.nextInt(); 
			System.out.println("\nNúmero adicionado com sucesso!");
			valores.add(numero);
		}
		
		for(Integer numero: valores) {
			soma += numero;
			if (numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("A lista é: " + valores);
		System.out.println("A soma de todos os elementos é: " + soma);
		System.out.println("A média dos elementos é: " + (soma)/5);
		System.out.println("A lista é: " + maior);
		
		leia.close();

	}
	
	

}
