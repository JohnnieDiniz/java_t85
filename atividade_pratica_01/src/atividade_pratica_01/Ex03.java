
/**
	 *  --- Calculádora Básica ---
	 *  
	 *  Aqui é uma calculádora básica, fazendo algumas operações básicas!
	 *  
	 * 
	 *   --- Calculádora Básica ----
	 *   **/


package atividade_pratica_01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double num1,num2;
	
		System.out.println(" ----------------------------------------");
		System.out.println(" ---------     Cálcularadora     --------");
		System.out.println(" ----------------------------------------");

		System.out.println("--------------------------------------------");
		System.out.println("               Operações                    ");
		System.out.println("--------------------------------------------");
		System.out.println("	1. Soma		");
		System.out.println("	2. Subtração		");
		System.out.println("	3. Multiplicação		");
		System.out.println("	4. Divisão		");
		System.out.println("	5. Potencicaão.		");
		System.out.println("	6. Raiz Quadrada	");
		System.out.println("--------------------------------------------");
		
		System.out.println("Escolha a operação que deseja realizar: ");
		int operacao = leia.nextInt();
		
		switch(operacao) {
			case 1:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				num2 = leia.nextDouble();
				double operacaoSoma = num1 + num2;
				
				System.out.printf("A soma entre %.2f + %.2f = %.2f", num1, num2, operacaoSoma);
				
		break;
			case 2:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				num2 = leia.nextDouble();
				double operacaoSubtracao = num1 - num2;
				
				System.out.printf("A subtração entre %.2f - %.2f = %.2f", num1, num2, operacaoSubtracao);
				
		break;
			case 3:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				num2 = leia.nextDouble();
				
				double operacaoMultiplicacao = num1 * num2;
				
				System.out.printf("A multiplicação entre %.2f x %.2f = %.2f", num1, num2, operacaoMultiplicacao);
		break;
			case 4:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				num2 = leia.nextDouble();
				
				double operacaoDivisao = num1 / num2;
				
				System.out.printf("A divisão entre %.2f / %.2f = %.2f", num1, num2, operacaoDivisao);
		break;
			case 5:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				num2 = leia.nextDouble();
				
				System.out.printf("A pontecia de %.2f ^ %.2f = %.2f", num1, num2, Math.pow(num1, num2));
		break;
			case 6:
				System.out.println("Digite o um número: ");
				num1 = leia.nextDouble();
				if(num1 > 0) {
					System.out.printf("\n Raiz quadrada de %.2f = %.2f", num1, Math.sqrt(num1));
				} else {
					if(num1 < 0) {
						System.out.println("Ainda não cheguei nesse nível, por favor tente colocar um número maior, ou igual a zero!");
					}
				}
		break;
		default:
			System.out.println("Opção inválida!");
		}
		
		
	
		
		System.out.println(" \n\n--- Fim do Programa ----");
		leia.close();
	}

}
