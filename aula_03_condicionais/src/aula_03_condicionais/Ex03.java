package aula_03_condicionais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int codigo, quantidade;
        String produto = "";
        double preco = 0, valorTotal;

        System.out.println("===== CARDÁPIO =====");
        System.out.println("1 - Cachorro Quente - R$ 10.00");
        System.out.println("2 - X-Salada        - R$ 15.00");
        System.out.println("3 - X-Bacon         - R$ 18.00");
        System.out.println("4 - Bauru           - R$ 12.00");
        System.out.println("5 - Refrigerante    - R$ 8.00");
        System.out.println("6 - Suco de Laranja - R$ 13.00");
        System.out.println("====================");

        System.out.print("\nDigite o código do produto: ");
        codigo = leia.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = leia.nextInt();

        switch (codigo) {

        case 1:
            produto = "Cachorro Quente";
            preco = 10.00;
            break;

        case 2:
            produto = "X-Salada";
            preco = 15.00;
            break;

        case 3:
            produto = "X-Bacon";
            preco = 18.00;
            break;

        case 4:
            produto = "Bauru";
            preco = 12.00;
            break;

        case 5:
            produto = "Refrigerante";
            preco = 8.00;
            break;

        case 6:
            produto = "Suco de Laranja";
            preco = 13.00;
            break;

        default:
            System.out.println("Código inválido!");
            leia.close();
            return;
        }

        valorTotal = quantidade * preco;

        System.out.println("\n===== PEDIDO =====");
        System.out.println("Produto: " + produto);
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal);
		
		leia.close(); 
	
	}
}