package bloco1;

import java.util.Scanner;

public class parOUimpar {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n;
		
		System.out.println("\nInsira um n�mero: ");
		n = ler.nextFloat();
		
		if((n%2==0)) {
			System.out.println("\nO n�mero "+n+" � par");
		    System.out.println("\nA ra�z quadrada � : "+Math.sqrt(n)); }
			 
		   else {
				System.out.println("\nO n�mero "+n+" � �mpar");
				System.out.println("\nElevado ao quadrado �: "+Math.pow(n, 2));
			}
	}
}
			
		
