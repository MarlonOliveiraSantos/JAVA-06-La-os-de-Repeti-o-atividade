package Atividade;

import java.util.Scanner;

public class Atividade_lista2_5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int cd,qt;
		
		System.out.println("Código do Produto: ");
		cd = ler.nextInt();
		
		System.out.println("Quantidade: ");
		qt = ler.nextInt();

		switch(cd) {
		case(1):
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("Valor total: R$ %.2f", qt * 10.00);
			break;
		case(2):
			System.out.println("Produto: X-Salada");
			System.out.printf("Valor total: R$ %.2f",  qt * 15.00);
			break;
		case(3):
			System.out.println("Produto: X-Bacon");
			System.out.printf("Valor total: R$ %.2f", qt * 18.00);
			break;
		case(4):
			System.out.println("Produto: Bauru");
			System.out.printf("Valor total: R$ %.2f", qt * 12.00);
			break;
		case(5):
			System.out.println("Produto: Refrigerante");
			System.out.printf("Valor total: R$ %.2f", qt * 08.00);
			break;
		case(6):
			System.out.println("Produto: Suco de laranja");
			System.out.printf("Valor total: R$ %.2f", qt * 13.00);
			break;	
		
		default:
			System.out.println("Opção invalida");
		
		}
		
		ler.close();
	}

}
