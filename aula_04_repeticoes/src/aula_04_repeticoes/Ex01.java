package aula_04_repeticoes;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int intervaloMenor, intervaloMaior;
		
		System.out.print("Digite o primeiro número do intervalo: ");
		intervaloMenor = leia.nextInt();
		
		System.out.print("Digite o último número do intervalo: ");
		intervaloMaior = leia.nextInt();

		if (intervaloMenor >= intervaloMaior) {
			System.out.println("Opção inválida");
		}else {
			for(int contador = intervaloMenor; contador <= intervaloMaior; contador ++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", contador);
				}
			}
		}
			
		
		
		leia.close();

	}

}

