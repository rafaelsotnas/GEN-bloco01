package ex_op.aritmeticos;

import java.util.Scanner;

public class ex5_calcularMediaPonderada {
	
	public static void main(String[] args) {
		
		float n1, n2, n3, p1=2, p2=3, p3=5, media, mediaP;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPrimeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nSegunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nTerceira nota: ");
		n3 = leia.nextFloat();
		
		media = p1 * n1 + p2 * n2 + p3 * n3;
		mediaP = media / 10;
		
		System.out.println("\nA média ponderada é: "+mediaP);
		
		
	}

}
