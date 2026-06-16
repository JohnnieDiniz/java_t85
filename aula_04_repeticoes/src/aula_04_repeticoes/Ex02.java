package aula_04_repeticoes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int menores21 = 0, maiores50 = 0, idade;
		
		System.out.printf("Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade > 0) {
			if(idade < 21 ) {
				menores21 ++; 
			}
			
			if(idade > 50 ) {
				maiores50 ++; 
			}
			
			System.out.printf("Digite a proxima idade: ");
			idade = leia.nextInt();
		}
		
		System.out.printf("Total de pessoas maiores de 50 anos: %d e menores que 21 anos: %d", maiores50, menores21);
		
		leia.close();

	}

}
