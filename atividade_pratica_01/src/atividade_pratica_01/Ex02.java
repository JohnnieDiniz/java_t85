/**
	 *  --- Cálculo de Média Escolar ---- 
	 *  
	 *  É um sistema onde o usuário irá digitar o nome, idade, a turma/ série e as notas que tirou, nota 1 e nota 2
	 *  e o sistema irá mostrar se ele foi aprovado, aprovado mas ficou de recuperação ou reprovado.
	 *  
	 * 
	 *   --- Cálculo de Média Escolar ----
	 *   **/
package atividade_pratica_01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade, serie, nota1, nota2;
		
		System.out.println(" ----------------------------------------");
		System.out.println(" ---     Cálculo da Média Escolar     ----");
		System.out.println(" ----------------------------------------");
		
		System.out.println("Digite o seu nome completo: ");
		String nomeCompleto = leia.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite a sua série: ");
		serie = leia.nextInt();
		
		System.out.println("Digite a sua primeira nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a sua segunda nota: ");
		nota2 = leia.nextInt();
		
		float mediaFinal = (nota2 + nota2) / 2;
	
		if (mediaFinal >= 7) {
			System.out.printf("\nAluno: %s, Ano-Escolar: %d, idade: %d foi aprovado com sucesso tendo sua média: %.2f.", nomeCompleto, serie, idade, mediaFinal);
		} else {
			if (mediaFinal >= 5 && mediaFinal < 7) {
				System.out.printf("\nAluno: %s, Ano-Escolar: %d, idade: %d foi aprovado, mas participará da recuperação escolar tendo sua média: %.2f.", nomeCompleto, serie, idade, mediaFinal);
			} else {
				if (mediaFinal < 5) {
					System.out.printf("\nAluno: %s, Ano-Escolar: %d, idade: %d foi reprovado tendo sua média: %.2f, infelizmente terá que realizar o ano escolar novamnete.", nomeCompleto, serie, idade, mediaFinal);
				}
				
			}
		}
		
		System.out.println(" \n\n--- Fim do Programa ----");
		leia.close();

	}

}
