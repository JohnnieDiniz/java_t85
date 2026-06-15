	
	/**
	 *  --- Sistema de Verificação de Idade ---- 
	 *  
	 *  É um sistema onde o usuário irá digitar o nome e idade.
	 *  
	 *  Se o usu[ario for maior  ou igual a 18 anos, acesso liberado! 
	 *  
	 *  Se o usuário for menor que 18 anos, acesso moderado referente a autorização de um responsável,
	 *  caso não haja uma autorização, acesso negado. 
	 *  
	 *   --- Sistema de Verificação de Idade ---- 
	 *   **/


package atividade_pratica_01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade; 
		boolean autorizacaoMenor18 = true;
	
		System.out.println(" ----------------------------------------");
		System.out.println(" --- Sistema de Verificação de Idade ----");
		System.out.println(" ----------------------------------------");
		
		System.out.println("\nDigite o seu nome: ");
		String nomeCompleto = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18) {
			System.out.printf("\nEntrada autorizada: %b, seja bem vindo(a): %s, Idade: %d",autorizacaoMenor18, nomeCompleto, idade);
		} else {
			
			if (idade < 18) {
				System.out.printf("\n %s, você tem autorização de um responsável? true (Sim) ou false (não)", nomeCompleto);
				autorizacaoMenor18 = leia.nextBoolean();
			} 
			
			if (autorizacaoMenor18 == true) {
				System.out.printf("\nEntrada autorizada: %b, seja bem vindo(a): %s, idade: %d",autorizacaoMenor18, nomeCompleto, idade);
			} else {
				System.out.printf("\nEntrada somente com a autorização de um responsável, ou, acompanhado de um adulto!");
			}
		}

		System.out.println(" \n\n--- Fim do Programa ----");
		
		leia.close();

	}

}
