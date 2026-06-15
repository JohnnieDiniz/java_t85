package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome; 
		int faixaEtaria; 
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();		
		
		System.out.printf("\nNone: %s",nome);
		
		System.out.println("--------------------------------------------");
		System.out.println("               Faixa Etária                     ");
		System.out.println("--------------------------------------------");
		System.out.println("	1. 0 a 10 anos de idade.		");
		System.out.println("	2. 11 a 29 anos de idade.		");
		System.out.println("	3. 30 a 45 anos de idade.		");
		System.out.println("	4. 46 a 59 anos de idade.		");
		System.out.println("	5. 60 a 65 anos de idade.		");
		System.out.println("	6. Maiores de 65 anos.	");
		System.out.println("--------------------------------------------");
		
		System.out.println("Escolha a sua Faixa Etária: ");
		faixaEtaria = leia.nextInt();
		
		switch(faixaEtaria) {
			case 1: 
				System.out.println("A mensalidade do plano é R$ 100,00");
			break;
			case 2: 
				System.out.println("A mensalidade do plano é R$ 200,00");
			break;
			case 3: 
				System.out.println("A mensalidade do plano é R$ 300,00");
			break;
			case 4: 
				System.out.println("A mensalidade do plano é R$ 500,00");
			break;
			case 5: 
				System.out.println("A mensalidade do plano é R$ 600,00");
			break;
			case 6: 
				System.out.println("A mensalidade do plano é R$ 1000,00");
			break;
			default:
				System.out.println("Opção inválida!");
		}
		
		
		
		
		
		leia.close();

	}

}
