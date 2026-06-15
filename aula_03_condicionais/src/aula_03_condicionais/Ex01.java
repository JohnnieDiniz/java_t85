package aula_03_condicionais;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println(" --- Jogo da Comparação ---");
		
		System.out.println(" \n--- Regras ---");
		System.out.println(" \n--- 1. Tente fazer que a soma de A e B seja maior que C ---");
		System.out.println(" \n--- 2. Tente fazer que a soma de A e B seja menor que C ---");
		System.out.println(" \n--- 3. Tente fazer que a soma de A e B seja igual que C ---");
		System.out.println(" \n--- Boa sorte ---");
		
		System.out.println("\nDigite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		if (a + b > c) {
			System.out.printf("Legal, a soma dos valores A, B é maior que C, tente fazer que a soma seja menor que C!, execute o programa novamente. ");
		} else if (a + b < c) {
			System.out.printf("Legal, a soma dos valores A, B é menor que C, tente fazer que a soma seja igual a C! execute o programa novamente. ");
		} else if (a + b == c) {
			System.out.printf("Legal, a soma dos valores A, B é igual que C, execute o programa novamente! ");
		}
		
		System.out.println(" \n--- Fim do Programa ---");
		leia.close();

	}

}
