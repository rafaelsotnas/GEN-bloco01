package bloco1;

import java.util.Scanner;

public class exmatrizvalorAcima10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int [][] n = new int[3][3];
		int linha, coluna;
		int maior10=10, cont=0;
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nInsira um número: ");
				n[linha][coluna] = ler.nextInt();
				
				if(n[linha][coluna]>maior10) {
		            cont++;
			       }   
		       }
	       }
		System.out.println(+cont+" é a quantidade de números maiores que 10.");

	  }

  }


