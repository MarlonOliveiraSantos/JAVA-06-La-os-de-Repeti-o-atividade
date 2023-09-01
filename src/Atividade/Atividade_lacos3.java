package Atividade;

import java.util.Scanner;

public class Atividade_lacos3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = ler.next();
		
		System.out.println("Digite a Idade do doador: ");
		idade = ler.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		doacao = ler.nextBoolean();
		
		if (idade >= 60 && idade <= 69) {
			if(doacao == true) {
				System.out.println(nome + " não está apto para doar sangue!");
			} else if (doacao == false){
				System.out.println(nome + " está apto para doar sangue!");
			}
		} 
		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " está apto para doar sangue!");
		} 
		else if (idade < 18 || idade > 69){
			System.out.println(nome + " não está apto para doar sangue!");
		}
		
	}		
}		

