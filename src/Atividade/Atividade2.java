package Atividade;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			float n1, n2, n3, n4;			 
			
			
			System.out.println("Digite a Nota 1: ");
			n1 = ler.nextFloat();
			
			System.out.println("Digite a Nota 2: ");
			n2 = ler.nextFloat();
			
			System.out.println("Digite a Nota 3: ");
			n3 = ler.nextFloat();
			
			System.out.println("Digite a Nota 4: ");
			n4 = ler.nextFloat();
			
			float media = (n1+n2+n3+n4)/4;
			
			//System.out.print("A média do participante é " + media);
			System.out.printf("A média do participante é: %.1f", media);
			
			
			
			
		}

	}

}
