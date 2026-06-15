package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalVF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 15;
		
		if (idade >= 18) {
			
			System.out.println("O participante é maior de idade");
		} else {
			System.out.println("O participante é menor de idade");
		}
		
		leia.close();

	}

}
