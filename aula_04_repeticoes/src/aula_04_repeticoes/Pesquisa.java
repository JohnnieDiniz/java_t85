package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0, somaIdades = 0, futebol = 0,voleiM18 = 0;
		
		double mediaIdades = 0.0;
		
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.println("-------------- Pesquisa Esportes Favoritos -------------");
			
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			do {
				System.out.println("----- Escolha o seu Esporte Favorito  -----");
				
				System.out.println("-------------------------------");
				System.out.println("  Código  |     Esportes      |         ");
				System.out.println("-------------------------------");
				System.out.println("    1.    |     Futebol       |         ");
				System.out.println("    2.    |     Voleibol      |         ");
				System.out.println("    3.    |     Basquetebol   |	        ");
				System.out.println("    4.    |     outros        | 	     ");
				System.out.println("-------------------------------");
				esporte = leia.nextInt();
			}while (esporte < 1 || esporte > 4);{}
			/* Estatísticas */
			
			// todas as pessoas que responderam a pesquisa
			totalRespostas ++; 
			
			// soma das idades da pesquisa 
			somaIdades += idade;
			
			// total de pessoal que futebol 
			if (esporte == 1)
				futebol ++;
			
			// total de pessaol que gostam de voltei e são maiores de 18 
			if (idade > 18 && esporte == 2)
				voleiM18 ++;
			
			do {
				System.out.println("Deseja continuar? (S/N) ");
				continua = leia.next().toUpperCase().charAt(0);
			} while (!(continua == 'S') && !(continua == 'N') );{
				
			}
		}
		
		
		mediaIdades = somaIdades / totalRespostas;
		System.out.printf("Média das idades: %.2f\n", mediaIdades);
		System.out.printf("Total de pessoa que gostam de futebol: %d\n", futebol);
		System.out.printf("Total de pessoa que gostam de volei e são maiores de 18 anos: %d\n", voleiM18);
		
		leia.close();

	}

}
