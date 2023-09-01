package Atividade;

import java.util.Scanner;

public class Lacos_repeti_lista1_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n, i, par = 0, impar = 0;

		for (i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º número: ");
			n = ler.nextInt();

			if (n % 2 == 0) {
				par++;

			} else {
				impar++;
			}

		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números pares: " + impar);

	}

}
