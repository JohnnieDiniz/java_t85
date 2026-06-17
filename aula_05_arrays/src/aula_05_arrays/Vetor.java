package aula_05_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		// vetor inicializado com dados
		int vetorInteiros[] = {10,20,70,45,78,100, 35, 70};
		
		//vetor vazio
		float vetorReais[] = new float[5];
		
		// listar todos os dados do vetor dos inteiros. 
		
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			System.out.printf("vetorInteiros[%d]: %d,\n", contador, vetorInteiros[contador]);
		
		}
		
		
		
		for (int contador = 0; contador < vetorReais.length; contador ++) {
			System.out.printf("Digite um valor Real para a posição: %d\n",contador);
			vetorReais[contador] = leia.nextFloat();
		}
		//ordena o vetror em ordem crescente (muda a ordem do vetor)
		Arrays.sort(vetorReais);
		
		for (int contador = 0; contador < vetorReais.length; contador ++) {
			System.out.printf("vetorReal[%d]: %.2f,\n", contador, vetorReais[contador]);
		}
		
		System.out.println("---------------------------------------------------------");
		
		// ordena o vetor em ordem decrescente (não muda a ordem do vetor)
		for (int contador = vetorReais.length - 1; contador >= 0; contador --) {
			System.out.printf("vetorReal[%d]: %.2f,\n", contador, vetorReais[contador]);
		}
		 
		System.out.println("Tamanho do vetor de inteiros: " + vetorInteiros.length);
		System.out.println("Tamanho do vetor de Reais: " + vetorReais.length);
		
		
		
		leia.close();

	}

}
