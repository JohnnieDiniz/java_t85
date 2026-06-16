package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia = new Scanner(System.in);
		
		int numero;
		int contador = 12;
		
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		do {
			System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
			contador ++;
		}while(contador <= 10);
			
		leia.close();

	}

}
