package aula_04_repeticoes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, identidadeGenero, pessoaDesenvolvedora;
		int totalBackend = 0;
		int mulheresFrontend = 0;
		int homensMobileMais40 = 0;
		int naoBinariosFullStackMenos30 = 0;
		int totalPesquisa = 0;
		int somaIdades = 0;

		char desejaContinuar = 'S';

		while (desejaContinuar == 'S') {

			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("------------------------------------");
			System.out.println("---------- Pesquisa Tech -----------");
			System.out.println("------------------------------------");
			System.out.println("  Código  |  Identidade de Gênero  |");
			System.out.println("------------------------------------");
			System.out.println("    1.    |       Mulher Cis       |");
			System.out.println("    2.    |       Homem Cis        |");
			System.out.println("    3.    |       Não Binário      |");
			System.out.println("    4.    |       Mulher Trans     |");
			System.out.println("    5.    |       Homem Trans      |");
			System.out.println("    6.    |       Outros           |");
			System.out.println("------------------------------------");
			System.out.print("Identidade de Gênero: ");
			identidadeGenero = leia.nextInt();

			System.out.println("------------------------------------");
			System.out.println("---------- Pesquisa Tech -----------");
			System.out.println("------------------------------------");
			System.out.println("  Código  | Pessoa Desenvolvedora  |");
			System.out.println("------------------------------------");
			System.out.println("    1.    |       Backend          |");
			System.out.println("    2.    |       Frontend         |");
			System.out.println("    3.    |       Mobile           |");
			System.out.println("    4.    |       FullStack        |");
			System.out.println("------------------------------------");
			System.out.print("Pessoa Desenvolvedora: ");
			pessoaDesenvolvedora = leia.nextInt();

			totalPesquisa++;
			somaIdades += idade;

			if (pessoaDesenvolvedora == 1) {
				totalBackend++;
			}

			if ((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
				mulheresFrontend++;
			}

			if ((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
				homensMobileMais40++;
			}

			if (identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
				naoBinariosFullStackMenos30++;
			}

			System.out.print("\nDeseja continuar (S/N): ");
			desejaContinuar = leia.next().toUpperCase().charAt(0);

			System.out.println();
		}

		double mediaIdades = (double) somaIdades / totalPesquisa;

		System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobileMais40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinariosFullStackMenos30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPesquisa);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdades);

		leia.close();
	}
}