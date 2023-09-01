package Atividade;

import java.util.Scanner;

public class Atividade_entrada4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("numero1: ");
		n1 = ler.nextFloat();
		System.out.println("numero2: ");
		n2 = ler.nextFloat();
		System.out.println("numero3: ");
		n3 = ler.nextFloat();
		System.out.println("numero4: ");
		n4 = ler.nextFloat();
		
		System.out.printf("Diferença: %.1f", (n1*n2) - (n3*n4));
	}	
}
