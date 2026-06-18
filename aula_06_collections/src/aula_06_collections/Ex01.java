package aula_06_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cor = new ArrayList<String>();
		
		int adicionar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		while(adicionar <= 4) {
			adicionar ++;
			System.out.println("Digite uma cor: ");
			cor.add(leia.nextLine());
			
		} 
		
		Collections.sort(cor); // ordena 
		
		System.out.println("As cores adicionadas são: ");
		for(String cores : cor) {
			System.out.print(cores + " - ");
		}
		
		System.out.println("Fim do programa");
		
		leia.close();

	}

}
