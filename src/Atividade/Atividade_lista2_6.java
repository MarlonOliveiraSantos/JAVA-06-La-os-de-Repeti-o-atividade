package Atividade;

import java.util.Scanner;

public class Atividade_lista2_6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		int codigo;
		float salario;

		System.out.println("Nome do colaborador: ");
		nome = ler.nextLine();

		System.out.println("Cargo: ");
		codigo = ler.nextInt();

		System.out.println("Salário: ");
		salario = ler.nextFloat();

		switch (codigo) {
		case (1):
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Gerente");
			System.out.printf("Salário: R$ %.2f", salario + (0.1 * salario));
			break;
		case (2):
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Vendedor");
			System.out.printf("Salário: R$ %.2f", salario + (0.07 * salario));
			break;
		case (3):
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Supervisor");
			System.out.printf("Salário: R$ %.2f", salario + (0.09 * salario));
			break;
		case (4):
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Motorista");
			System.out.printf("Salário: R$ %.2f", salario + (0.06 * salario));
			break;
		case (5):
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Estoquista");
			System.out.printf("Salário: R$ %.2f", salario + (0.05 * salario));
			break;
		case (6):
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Técnico de TI");
			System.out.printf("Salário: R$ %.2f", salario + (0.08 * salario));
			break;	
		
		}
		ler.close();
	}

}
