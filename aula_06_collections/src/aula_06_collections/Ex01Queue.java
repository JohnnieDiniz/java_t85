package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao = 0;

		Scanner leia = new Scanner(System.in);
		
		 do {
			
			System.out.println("------------------------------------------------");
			System.out.println("--------------- Menu - Clientes ----------------");
			System.out.println("------------------------------------------------");
			System.out.println("  Código  |                Opções              |");
			System.out.println("------------------------------------------------");
			System.out.println("    1.    |   Adicionar Clientes na fila.      |");
			System.out.println("    2.    |   Listar todos os clientes.        |");
			System.out.println("    3.    |   Retirar Clientes da fila.        |");
			System.out.println("    0.    |   Sair do menu                     |");
			System.out.println("------------------------------------------------");
			
			System.out.println("Escolha uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();
			switch(opcao) {
				case 1: 
					System.out.println("------ Cadastro de Clientes ------");
					
					System.out.println("\nDigite o nome do cliente: ");
					String nomeCliente = leia.nextLine(); 
					System.out.println("\nCliente adicionado com sucesso!");
					fila.add(nomeCliente);
					break;
				case 2: 
					System.out.println("------ Lista dos Clientes ------");
					System.out.println("\nA fila está vazia? " + fila.isEmpty());
					System.out.println("\nTamanho da atual da fila:  " + fila.size());
					System.out.print(" - " + fila);
					leia.nextLine();
					break;
				case 3: 
					System.out.println("------ Remoção dos Clientes ------");
					System.out.println("\nRemovendo o primeiro da fila: " + fila.poll());
					System.out.println("\nCliente removido com sucesso!");
					
					break;
				case 0: 
					System.out.println("Você saiu do programa! ");
					break;
				default:
					System.out.println("Opção inválida!"); }
					} while (opcao != 0);
		
		leia.close();

	}

}
