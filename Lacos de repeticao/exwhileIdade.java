package bloco1;

import java.util.Scanner;

public class exwhileIdade {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade, menos21=0, mais50=0;
		
		System.out.println("\nInsira sua idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99) {
			System.out.println("\nInsira sua idade: ");
			idade = ler.nextInt();
			
			if(idade<=21) {
				menos21++;
			}
			if(idade>=50) {
				mais50++;
			}
		}
		System.out.println(+menos21+" pessoa(s) com menos de 21 anos.");
		System.out.println(+mais50+" pessoa(s) com mais de 50 anos.");
	}

}
