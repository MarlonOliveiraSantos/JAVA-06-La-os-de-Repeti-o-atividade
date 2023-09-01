package Atividade;

import java.util.Scanner;

public class Lacos_repeti_lista3_5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n = 0, p = 0, resultado = 0;
		
		do {
			System.out.println("Digite um número: ");
			n = ler.nextInt();

			if (n > 0) {
				resultado += n ;
				
			}
			
		} while(n != 0) ;
		System.out.println("A soma dos números positivos é: " + resultado);

	}

}
