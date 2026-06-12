package aula_02_operadores;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu salário bruto: R$");
		float salariobruto = leia.nextFloat();
		
		System.out.println("Digite o seu adicional noturno: R$");
		float adicionalnoturo = leia.nextFloat();
		
		System.out.println("Digite o suas horas extras: R$");
		float horasextras = leia.nextFloat();
		
		System.out.println("Digite o seu desconto salarial: R$");
		float descontos = leia.nextFloat();
		
		float salarioliquido = salariobruto + adicionalnoturo + (horasextras * 5) - descontos;
		
		System.out.printf("Seu salário líquido é de: R$%.2f", salarioliquido);
		
		leia.close();

	}

}
