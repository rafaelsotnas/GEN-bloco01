package bloco1;

import java.util.Scanner;

public class incremento {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("\nPrimeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("\nSegundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("\nTerceiro número: ");
		n3 = ler.nextInt();
		
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("\nO maior número é:"+n1);}
			
		else if(n1 < n2 && n3 < n2) {
			System.out.println("\nO maior número é: "+n2);}
			
		else {
			System.out.println("\nO maior número é: "+n3);}
		}
	}
	

