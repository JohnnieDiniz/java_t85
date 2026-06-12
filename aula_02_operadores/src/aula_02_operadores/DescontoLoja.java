package aula_02_operadores;

import java.util.Scanner;

public class DescontoLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in); // Toda vez que abrir o scanner, temos que fechar. 
		
		final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
		
		System.out.print("Digite o valor total da compra: R$");
		double valorCompra = leia.nextDouble();
		
		System.out.print("\n O cliente é Prime? ");
		boolean isPrime = leia.nextBoolean();
		
		boolean ganhouFrete = (valorCompra >= VALOR_MINIMO_FRETE_GRATIS); 
		
		System.out.println(" --- Status do Pedidido --- ");
		System.out.printf("\n Valor da compra: R$ %.2f", valorCompra);
		System.out.printf("\n Cliente Prime? %b", isPrime);
		System.out.printf("\n Frete Grátis? %b", ganhouFrete);
		
		
		leia.close();

	}

}
