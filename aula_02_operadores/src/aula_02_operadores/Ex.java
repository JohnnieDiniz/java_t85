package aula_02_operadores;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--- Abono Salarial ---");

		System.out.println("Digite seu salário: R$");
		float salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: R$");
		float abono = leia.nextFloat();
		
		System.out.printf("Seu salário R$%.2f junto com o seu abono de R$%.2f, seu novo salário é de = R$%.2f", salario, abono, salario + abono);
		
		System.out.println("/n --- Fim do Programa ---");
		
		leia.close();
		

	}

}
