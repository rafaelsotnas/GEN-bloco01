package bloco1;

import java.util.Scanner;

public class exdowhileSoma {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int x, n, par=0, impar=0;
        
        System.out.println("\nInsira um número: ");
        n = ler.nextInt();

        for(x=1;x<=10;x++) {
        	
        	System.out.println("\nInsira um número: ");
            n = ler.nextInt();
            
        	if(n%2==0) {
        		par++;
        	}
        	else {
        		impar++;
        	}
        }
        System.out.println(+par+" números são pares.");
    	System.out.println(+impar+" números são ímpares.");
    }
}