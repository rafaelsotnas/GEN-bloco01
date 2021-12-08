package ex_op.aritmeticos;

import java.util.Scanner;

public class ex1_calcularIdadeExpressaEmDias {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double anos, meses, dias, diasT;
		// 1 ano = 365d / 1 mês = 30d / 1 dia = 1d
		
		System.out.println("\nSua idade é: ");
		anos = leia.nextFloat();
		
		System.out.println("\nOs meses são: ");
		meses = leia.nextFloat();
		
		System.out.println("\nE então os dias: ");
		dias = leia.nextFloat();
		
		diasT = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("\nAté hoje você respirou por: "+diasT+" dia(s)");
	}

}
