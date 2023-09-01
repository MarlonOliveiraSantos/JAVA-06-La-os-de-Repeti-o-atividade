package Atividade;

import java.util.Scanner;

public class Atividade_lista2_8 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float saldo, valor;
		int operacao;
		

		System.out.println("Operação: ");
		operacao = ler.nextInt();
		
		if (operacao == 2) {
			System.out.println("Valor: ");
			valor = ler.nextFloat();
		}
		if (operacao == 3) {
			System.out.println("Valor: ");
			valor = ler.nextFloat();
		}
		
		
		

		switch (operacao) {
		
		case(1): 
			System.out.println("Operação - Saldo" + "\nSaldo: R$ 1000.00");
			break;
			
		case(2): 
			System.out.println("Operação - Saque" + "\nSaldo: R$ 1000.00");
			//if (valor > 1000) {
				
			//}
		
			break;
			
		
			
		default:
			System.out.println("Opção invalida");
		}
	}
}