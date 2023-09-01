package Atividade;

import java.util.Scanner;

public class Atividade_lista2_7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1,n2,result;
		int operacao;
		
		System.out.println("Digite o 1º número: ");
		n1 = ler.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		n2 = ler.nextFloat();

		System.out.println("Operação: ");
		operacao = ler.nextInt();

		switch(operacao) {
		
		case(1): 
			result = n1 + n2;
			System.out.printf(n1 + " + " + n2 + " = " + result);	
			break;
		case(2): 
			result = n1 - n2;
			System.out.printf(n1 + " + " + n2 + " = " + result);	
			break;
		case(3): 
			result = n1 * n2;
			System.out.printf(n1 + " + " + n2 + " = " + result);	
			break;
		case(4): 
			result = n1 / n2;
			System.out.printf(n1 + " + " + n2 + " = " + result);	
			break;
			
		default: 
			System.out.println("Operação Inválida!");	
		}

	}

}
