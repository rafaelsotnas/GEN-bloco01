package bloco1;

import java.util.Scanner;

public class exdowhileMultiplos {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int n, cont=0, soma=0;
	double media=0;
	
	System.out.println("\nInsira um número: ");
	n = ler.nextInt();
    
	do {
		if (n%3==0) {
			soma+=cont;
			cont++;
		}
		{
			System.out.println("\nInsira um número: ");
			n = ler.nextInt();
		}
	} while(n!=0); 
	media = soma/cont;
	System.out.println(+media+" é a média dos números múltiplos por três."); 
  }
	
}

