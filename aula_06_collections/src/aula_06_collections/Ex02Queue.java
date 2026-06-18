package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex02Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		int opcao; 
		
		Scanner leia = new Scanner(System.in);
		
		 do {
				
				System.out.println("------------------------------------------------");
				System.out.println("--------------- Cadastro Livros ----------------");
				System.out.println("------------------------------------------------");
				System.out.println("  Código  |                Opções              |");
				System.out.println("------------------------------------------------");
				System.out.println("    1.    |   Adicionar um livro.              |");
				System.out.println("    2.    |   Listar todos os livros.          |");
				System.out.println("    3.    |   Retirar livro da pilha.          |");
				System.out.println("    0.    |   Sair do menu                     |");
				System.out.println("------------------------------------------------");
				
				System.out.println("Escolha uma opção: ");
				opcao = leia.nextInt();
				leia.nextLine();
				switch(opcao) {
					case 1: 
						System.out.println("------ Cadastro de Livros ------");
						System.out.println("\nDigite o nome do livro: ");
						String nomeLivro = leia.nextLine(); 
						System.out.println("\nLivro adicionado com sucesso!");
						pilha.push(nomeLivro);
						break;
					case 2: 
						System.out.println("------ Lista dos Clientes ------");
						System.out.println("\nA fila está vazia? " + pilha.isEmpty());
						System.out.println("\nTamanho da atual da fila:  " + pilha.size());
						System.out.print(" - " + pilha);
						leia.nextLine();
						break;
					case 3: 
						System.out.println("------ Remoção dos Livros ------");
						System.out.println("\nRemovendo o livro: (" + pilha.poll()+") da pilha");
						System.out.println("\nLivro removido com sucesso!");
						
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
