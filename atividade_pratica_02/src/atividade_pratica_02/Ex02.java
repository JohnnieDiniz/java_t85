package atividade_pratica_02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade, serie, opcao;
		double notaFinal;
	    
		Scanner leia = new Scanner(System.in);
	
		Deque<Double> notas = new ArrayDeque<Double>();
		Deque<String> cadastro = new ArrayDeque<String>();
		
		do {
			
			System.out.println("------------------------------------------------");
			System.out.println("--------------- Cadastro Alunos ----------------");
			System.out.println("------------------------------------------------");
			System.out.println("  Código  |                Opções              |");
			System.out.println("------------------------------------------------");
			System.out.println("    1.    |   Cadastrar aluno.                 |");
			System.out.println("    2.    |   Listar todos os alunos.          |");
			System.out.println("    3.    |   Retirar aluno da pilha.          |");
			System.out.println("    4.    |   Lista de Médias.                 |");
			System.out.println("    0.    |   Sair do menu                     |");
			System.out.println("------------------------------------------------");
			System.out.print("Escolha uma opção:  ");
			
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch(opcao) {
			case 1:
				
				System.out.println(" --- Cadastro de alunos - Escola do Diniz --- ");
				
				System.out.println("Digite o nome completo do aluno: ");
				nome = leia.nextLine();
				
				
				System.out.println("Digite a idade do aluno: ");
				idade = leia.nextInt();
				
				
				System.out.println("Digite a série do aluno: ");
				serie = leia.nextInt();
				
				cadastro.add(""
						+ "Nome: " + nome +
						"| Idade: " + idade + 
						"| Série: " + serie);
				
				
				for(int i = 1; i <= 5; i++) {
				    System.out.println("Digite a nota da matéria " + i);
				    double notaMateria = leia.nextDouble();
				    notas.add(notaMateria);
				}
			
				
				break;
			case 2:
				
				System.out.println(" --- Lista de alunos - Escola do Diniz --- ");
				System.out.println(cadastro + "\n");
								
				System.out.println("Total de alunos cadastrados: " + cadastro.size());
				break;
				
			case 3:
				System.out.println("\n--- Remover aluno ---");

				if (cadastro.isEmpty()) {
					System.out.println("Nenhum aluno cadastrado para remover.\n");
				} else {
					String alunoEncontrado = null;

					System.out.print("Digite o nome do aluno que deseja remover: ");
					nome = leia.nextLine();

					for (String aluno : cadastro) {
						if (aluno.contains(nome)) {
							alunoEncontrado = aluno;
							break;
						}
					}

					if (alunoEncontrado != null) {
						System.out.println("Aluno encontrado: " + alunoEncontrado);
						System.out.print("Deseja remover este aluno? Digite S para sim ou N para não: ");
						char confirmar = leia.next().toUpperCase().charAt(0);
						leia.nextLine();

						if (confirmar == 'S') {
							cadastro.remove(alunoEncontrado);
							System.out.println("Aluno removido com sucesso!\n");
						} else {
							System.out.println("Remoção cancelada.\n");
						}
					} else {
						System.out.println("Aluno não encontrado.\n");
					} 
				}
				break;
				
				/*
				 * Neste case, utilizei apoio da IA para compreender a lógica de busca
				 * e remoção de um aluno específico na coleção, mantendo minha adaptação
				 * no código final.
				 */
			case 4:
				double media = calcularMedia(notas);

				System.out.printf("Média geral das notas: %.2f", media);
				break;
			case 0:
				System.out.println("Programa finalizado ");
				break;
			default : 
				System.out.println("Digite uma opção valida! ");
			} 
			
			
		} while (opcao != 0);
		
		leia.close();

	}
	
	public static double calcularMedia(Deque<Double> notas) {

	    double soma = 0;

	    for(double nota : notas) {
	        soma += nota;
	    }

	    return soma / notas.size();
	}

}
