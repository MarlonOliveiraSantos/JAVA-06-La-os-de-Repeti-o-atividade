package Atividade;

import java.util.Scanner;

public class Atividade_entrada3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float sb,an,he,d;
		
		System.out.println("Salário Bruto: ");
		sb = ler.nextFloat();
		System.out.println("Adicional Noturno: ");
		an = ler.nextFloat();
		System.out.println("Horas Extras: ");
		he = ler.nextFloat();
		System.out.println("Descontos: ");
		d = ler.nextFloat();
		
		 
		System.out.printf("Salário Líquido: %.2f", sb + an + (he * 5) - d);
		
		ler.close();
	}

}
