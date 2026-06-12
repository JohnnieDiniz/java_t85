package aula_02_operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		
		System.out.println("*** CALCULADORA BÁSICA ***");
		
		System.out.print("\n Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("\n %.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
		System.out.printf("\n %.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
		System.out.printf("\n %.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
		System.out.printf("\n %.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
		System.out.printf("\n %.2f ^ %.2f = %.2f", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("\n Raiz quadrada de %.2f = %.2f", numero1, Math.sqrt(numero1));
		
		leia.close();

	}

}
