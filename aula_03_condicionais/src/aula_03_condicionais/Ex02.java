package aula_03_condicionais;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o Nome do doador: ");
        String nome = leia.nextLine();
        
        System.out.println("Digite a Idade do doador: ");
        int idade = leia.nextInt();
        
        System.out.println("Primeira doação de sangue? true/false");
        boolean primeiraDoacao = leia.nextBoolean();
        
        if (idade >= 18 && idade <= 59) {
            System.out.println(nome + " está apto para doar sangue!");
        } else if (idade >= 60 && idade <= 69) {
            if (primeiraDoacao == false) {
                System.out.println(nome + " não está apto para doar sangue!");
            } else {
                System.out.println(nome + " está apto para doar sangue!");
            }
        } else {
            System.out.println(nome + " não está apto para doar sangue!");
        }
        
        leia.close();
    }
}
		
			
			
		

	


