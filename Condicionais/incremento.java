package bloco1;

import java.util.Scanner;

public class incremento {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("\nPrimeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("\nSegundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("\nTerceiro n�mero: ");
		n3 = ler.nextInt();
		
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("\nO maior n�mero �:"+n1);}
			
		else if(n1 < n2 && n3 < n2) {
			System.out.println("\nO maior n�mero �: "+n2);}
			
		else {
			System.out.println("\nO maior n�mero �: "+n3);}
		}
	}
	

