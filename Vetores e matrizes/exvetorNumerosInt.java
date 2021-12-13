package bloco1;

import java.util.Scanner;

public class exvetorNumerosInt {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, somaP=0, par=0, quantI=0;
		int[] n = new int [6];
		
        for(x=0;x<6;x++) {
        	System.out.println("\nInsira um número: ");
        	n[x] = ler.nextInt();
        	
        	if(n[x]%2==0) {
        		par++;
        		somaP+=n[x];
        	}
        	else  {
        		quantI++;
        	  }
           }
        System.out.println(+somaP+" foi a somatória dos pares.");
        System.out.println(+par+" foram os números pares inseridos."); 
        System.out.println(+quantI+" foi a quantidade de números ímpares inseridos.");
	    }
      }	



