package Atividade;

import java.util.Scanner;

public class Lacos_repeti_lista2_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade = 0, menor = 0, maior = 0;
						
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();		
			
			if (idade < 21 && idade > 0) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
			
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);
		
		

	}

}
