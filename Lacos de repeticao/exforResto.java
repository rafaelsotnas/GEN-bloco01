package bloco1;

import java.util.Scanner;

public class exforResto {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, x;
		
		System.out.println("\nInsira um n�mero: ");
		n = ler.nextInt();
		
		for(x=1000;x<=1999;x++) {
			if(x>=1000 && x<=1999) {
				if(x%11==5) {
					n=x;
					System.out.println("\nN�mero dividido por 11 com resto 5: "+n);
				}
			}
		}
			
	}
}
