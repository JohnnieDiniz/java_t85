package aula_02_operadores;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--- Diferença do Produto ---");
		
		System.out.println("\nDigite o primeiro número: ");
		float n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		float n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		float n4 = leia.nextFloat();
		
		float resultado = (n1 * n2) - (n3 * n4);
		
		System.out.printf("O Resultado da diferença do produto é de: %.2f", resultado);
		
		System.out.println("/n --- Fim do Programa ---");
		
		leia.close();

	}

}
