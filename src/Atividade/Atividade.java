package Atividade;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			float salario, abono;
			 
			
			
			System.out.println("Digite o Salário: ");
			salario = ler.nextFloat();
			
			System.out.println("Digite o Abono: ");
			abono = ler.nextFloat();
			
			float novoSalario = salario + abono;
			
			System.out.printf("Novo salário: %.2f", novoSalario);
		}
		
	}

}
