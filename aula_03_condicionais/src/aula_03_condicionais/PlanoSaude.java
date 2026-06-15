package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome; 
		int idade; 
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();		
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		
		/**
		 *  0 -- 10 = R$ 100,00 
		 *  11 -- 29 = R$ 200,00
		 *  30 -- 45 = R$ 300,00 
		 *  46 -- 59 = R$ 500,00
		 *  60 -- 65 = R$ 600,00
		 *  65+ = R$ 1000,00
		 * */
		
		System.out.printf("\nNone: %s",nome);
		
		if (idade > 0 && idade <= 10) {
			System.out.println("A mensalidade do plano é R$ 100,00");
		} else if (idade >= 11 && idade <= 29) {
			System.out.println("A mensalidade do plano é R$ 200,00");
		} else if (idade >= 30 && idade <= 45) {
			System.out.println("A mensalidade do plano é R$ 300,00");
		} else if (idade >= 46 && idade <= 59) {
			System.out.println("A mensalidade do plano é R$ 500,00");
		} else if (idade >= 60 && idade <= 65) {
			System.out.println("A mensalidade do plano é R$ 600,00");
		} else {
			System.out.println("A mensalidade do plano é R$ 1000,00");
		}
		
		
		
		leia.close();

	}

}
