package bloco1;

import java.util.Scanner;

public class parOUimpar {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n;
		
		System.out.println("\nInsira um número: ");
		n = ler.nextFloat();
		
		if((n%2==0)) {
			System.out.println("\nO número "+n+" é par");
		    System.out.println("\nA raíz quadrada é : "+Math.sqrt(n)); }
			 
		   else {
				System.out.println("\nO número "+n+" é ímpar");
				System.out.println("\nElevado ao quadrado é: "+Math.pow(n, 2));
			}
	}
}
			
		
