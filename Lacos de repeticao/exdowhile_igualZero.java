package bloco1;

import java.util.Scanner;

public class exdowhile_igualZero {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		
		System.out.println("\nInsira um n�mero: ");
		n = ler.nextInt();
		
		do {
			System.out.println("\nInsira um n�mero: ");
			n = ler.nextInt();
			soma+=n;
		} 
		while(n!=0);
		{
		System.out.println(+soma+" s�o os n�meros somados.");
		}
	}
}