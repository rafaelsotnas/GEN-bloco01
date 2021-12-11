package bloco1;

import java.util.Scanner;

public class exdowhile_igualZero {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		
		System.out.println("\nInsira um número: ");
		n = ler.nextInt();
		
		do {
			System.out.println("\nInsira um número: ");
			n = ler.nextInt();
			soma+=n;
		} 
		while(n!=0);
		{
		System.out.println(+soma+" são os números somados.");
		}
	}
}