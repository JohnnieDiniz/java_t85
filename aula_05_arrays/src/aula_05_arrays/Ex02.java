package aula_05_arrays;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int matrizInteiros[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        System.out.println("Elementos da Diagonal Principal:");

        for (int linha = 0; linha < matrizInteiros.length; linha++) {
            for (int coluna = 0; coluna < matrizInteiros.length; coluna++) {

                if (linha == coluna) {
                    System.out.print(matrizInteiros[linha][coluna] + " ");
                    diagonalPrincipal += matrizInteiros[linha][coluna];
                }

            }
        }

        System.out.println("\n\nElementos da Diagonal Secundária:");

        for (int linha = 0; linha < matrizInteiros.length; linha++) {
            for (int coluna = 0; coluna < matrizInteiros.length; coluna++) {

                if (linha + coluna == matrizInteiros.length - 1) {
                    System.out.print(matrizInteiros[linha][coluna] + " ");
                    diagonalSecundaria += matrizInteiros[linha][coluna];
                }

            }
        }

        System.out.printf("\n\nSoma dos Elementos da Diagonal Principal: %d", diagonalPrincipal);
        System.out.printf("\nSoma dos Elementos da Diagonal Secundária: %d", diagonalSecundaria);

        leia.close();
    }
}