package atividade_pratica_02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		String nomeProduto;
		int quantidade, opcao;

		Scanner leia = new Scanner(System.in);

		Deque<String> estoque = new ArrayDeque<String>();

		do {

			System.out.println("------------------------------------------------");
			System.out.println("--------------- Controle Estoque ---------------");
			System.out.println("------------------------------------------------");
			System.out.println("  Código  |                Opções              |");
			System.out.println("------------------------------------------------");
			System.out.println("    1.    |   Adicionar produto.               |");
			System.out.println("    2.    |   Atualizar quantidade.            |");
			System.out.println("    3.    |   Listar todos os produtos.        |");
			System.out.println("    0.    |   Sair do menu                     |");
			System.out.println("------------------------------------------------");
			System.out.print("Escolha uma opção: ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("\n--- Adicionar Produto ---");

				System.out.print("Digite o nome do produto: ");
				nomeProduto = leia.nextLine();

				System.out.print("Digite a quantidade em estoque: ");
				quantidade = leia.nextInt();

				estoque.add("Produto: " + nomeProduto + " | Quantidade: " + quantidade);

				System.out.println("\nProduto adicionado com sucesso!\n");
				break;

			case 2:
				System.out.println("\n--- Atualizar Quantidade ---");

				if (estoque.isEmpty()) {
					System.out.println("Nenhum produto cadastrado para atualizar.\n");
				} else {
					String produtoEncontrado = null;

					System.out.print("Digite o nome do produto que deseja atualizar: ");
					nomeProduto = leia.nextLine();

					for (String produto : estoque) {
						if (produto.contains(nomeProduto)) {
							produtoEncontrado = produto;
							break;
						}
					}

					if (produtoEncontrado != null) {
						System.out.println("Produto encontrado: " + produtoEncontrado);

						System.out.print("Digite a nova quantidade em estoque: ");
						quantidade = leia.nextInt();

						estoque.remove(produtoEncontrado);
						estoque.add("Produto: " + nomeProduto + " | Quantidade: " + quantidade);

						System.out.println("\nQuantidade atualizada com sucesso!\n");
					} else {
						System.out.println("Produto não encontrado.\n");
					}
				}
				break;

			case 3:
				System.out.println("\n--- Lista de Produtos ---");

				if (estoque.isEmpty()) {
					System.out.println("Nenhum produto cadastrado.\n");
				} else {
					for (String produto : estoque) {
						System.out.println(produto);
					}
				}
				break;

			case 0:
				System.out.println("\nPrograma finalizado!");
				break;

			default:
				System.out.println("\nDigite uma opção válida!\n");
			}

		} while (opcao != 0);

		leia.close();
	}
}