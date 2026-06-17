package aula_05_arrays;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        int tentativas = 0;
        boolean encontrou = false;

        while (!encontrou && tentativas < 3) {

            System.out.print("Digite um valor: ");
            int valorPosicao = leia.nextInt();

            for (int posicao = 0; posicao < vetorInteiros.length; posicao++) {

                if (vetorInteiros[posicao] == valorPosicao) {

                    System.out.printf(
                        "\nO número %d foi localizado na posição: %d\n",
                        valorPosicao, posicao);

                    encontrou = true;
                    break;
                }
            }

            if (!encontrou) {
                tentativas++;
                System.out.println("Número não encontrado!");
            }
        }

        if (!encontrou) {
            System.out.println("\nVocê esgotou suas 3 tentativas.");
        }

        leia.close();
    }
}