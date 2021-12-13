package bloco1;

import java.util.Scanner;

public class exvetorArmazenamento {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma=0, x;
		int[] v = new int[6];
		
		v[0]=1; v[1]=0; v[2]=5; v[3]=-2; v[4]=-5; v[5]=7; 
		v[3]=100;
		soma = v[0]+v[1]+v[5];
		System.out.println("\nA soma das posições dos vetores v[0], v[1], v[5], é: "+soma);
		
		for(x=0;x<6;x++) {
			System.out.println("\nInsira um número: ");
			v[x] = ler.nextInt();
		}
		for(x=0;x<6;x++) {
		   v[4]+=100;
           System.out.println("\nDo primeiro vetor ao sexto, os valores são: "+v[x]);
		}
	}

}
