package Atividade;

import java.util.Scanner;

public class Atividade_lacos2 {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = ler.nextInt();
	
		
		if(n % 2 == 0 ) {	
			if (n > 0) {
				System.out.println("O número " + n + " é par e positivo");				
			} else {
				System.out.println("O número " + n + " é par e negativo");
			}
		} 
		else {
			if (n > 0) {
				System.out.println("O número " + n + " é impar e positivo");				
			} else {
				System.out.println("O número " + n + " é impar e negativo");
			}
		}					
		ler.close();
		
	}

}
