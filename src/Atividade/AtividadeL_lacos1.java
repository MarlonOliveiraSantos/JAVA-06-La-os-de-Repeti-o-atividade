package Atividade;

import java.util.Scanner;

public class AtividadeL_lacos1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite o número A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o número B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o número C: ");
		c = ler.nextInt();
		
		
		if(a+b > c) {
			System.out.println(a + " + " + b + " = " + 6 + " > " + c );
			System.out.println("A Soma de A + B é Maior do que C");			
		}
	
		else if(a+b < c) {
			System.out.println(a + " + " + b + " = " + 4 + " < " + c );
			System.out.println("A Soma de A + B é Menor do que C");
		}
		if(a+b == c) {
			System.out.println(a + " + " + b + " = " + 4 + " = " + c );
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		ler.close();
	}

}
