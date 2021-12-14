package bloco1;

import java.util.Scanner;

public class exmatriz2matrizes {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float m1[][] = new float[2][2];
		float m2[][] = new float[2][2];
		float m3[][] = new float[2][2];
		int constante, linha, coluna, op;
	
	    for(linha=0;linha<2;linha++) {
	    	for(coluna=0;coluna<2;coluna++) {
	    		System.out.println("\nInsira o valor da matriz um: ");
	    		m1[linha][coluna] = ler.nextFloat();
	    		System.out.println("\nInsira o valor da matriz um: ");
	    		m2[linha][coluna] = ler.nextFloat();
	    	}
	    }
	    do {
	    System.out.println("\n\t\tOpções: ");
	    System.out.println("\n1. Somar as duas matrizes.");
	    System.out.println("\n2. Subtrair primeira matriz da segunda.");
	    System.out.println("\n3. Adicionar uma constante em ambas matrizes.");
	    System.out.println("\n4. Imprimir as duas matrizes.");
	    System.out.println("\n5. Sair do sistema.");
	    System.out.println("\nInsira sua opção: ");
	    op = ler.nextInt();
	    
	    switch(op) {
	     case 1:
	    	 for(linha=0;linha<2;linha++) {
	    		 for(coluna=0;coluna<2;coluna++) {
	    			 m3[linha][coluna] = m1[linha][coluna]+m2[linha][coluna];
	    					 System.out.println("\nA soma das matrizes é: "+m3[linha][coluna]);
	    		 }
	    	 }
	    	 break;
	     case 2:
	    	 for(linha=0;linha<2;linha++) {
	    		 for(coluna=0;coluna<2;coluna++) {
	    			 m3[linha][coluna] = m2[linha][coluna]-m1[linha][coluna];
	    					 System.out.println("\nA subtração da primeira para a segunda matriz é: "+m3[linha][coluna]);
	    		 }
	    	 }
	    	 break;
	     case 3:
	    	 System.out.println("\nInsira o valor da constante: ");
	    	 constante = ler.nextInt();
	    	 
	    	 for(linha=0;linha<2;linha++) {
	    		 for(coluna=0;coluna<2;coluna++) {
	    			 m1[linha][coluna] += constante;
	    			 m2[linha][coluna] += constante;
	    					 System.out.println("\nMatriz 1: "+m1[linha][coluna]);
	    					 System.out.println("\nMatriz 2: "+m2[linha][coluna]);
	    		 }
	    	 }
	    	 break;
	     case 4:
	    	 for(linha=0;linha<2;linha++) {
	    		 for(coluna=0;coluna<2;coluna++) {
					 System.out.println("\nMatriz 1: "+m1[linha][coluna]);
					 System.out.println("\nMatriz 2: "+m2[linha][coluna]);
	    		 }
	    	 }
	    	 break;
	    	 default:
	    		 System.out.println("\nOpção inválida.");
	      }
	    } while(op!=0);
	}

}
