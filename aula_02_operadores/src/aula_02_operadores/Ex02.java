package aula_02_operadores;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--- Cálculo da Média --- ");
		
		System.out.println("\nDigite sua primeira nota: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		float nota2 = leia.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		float nota4 = leia.nextFloat();
		
		float media = nota1 + nota2 + nota3 + nota4;
		
		System.out.printf("\nÁ Média de suas notas é de: %.2f ", (media)/4);
		
		System.out.println("/n --- Fim do Programa ---");
				
		leia.close();

	}

}
