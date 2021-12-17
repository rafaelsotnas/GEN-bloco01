package poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TesteEstoque {
	
	public static void main(String[] args) {
		
    int op;
	
	Scanner ler = new Scanner(System.in);
		
		Camiseta cam = new Camiseta("Vestu�rio"," camiseta");
		Calca cal = new Calca("Vestu�rio"," cal�a");
		Tenis ten = new Tenis("Cal�ado", "t�nis");
		
		ArrayList <String> estoque2 = new ArrayList<String>(); {
		    do {
		    	System.out.println("\n\t\t\t***ESTOQUE***");
				System.out.println("\n1. Adicionar produto.");
				System.out.println("\n2. Remover produto.");
				System.out.println("\n3. Atualizar produto.");
				System.out.println("\n4. Mostrar todos os produtos.");
				System.out.println("\n5. Sair do programa.");
				System.out.println("\n6. Escolha: ");
				System.out.println("***********************");
			    op=ler.nextInt();
			    
			    switch(op) {
			    case 1:
			    	ler.nextLine();
			    	System.out.println("\nInsira um produto que queira adicionar no estoque: ");
			    	String produto = ler.nextLine();
			    	estoque2.add(produto);
			    	break;
			    case 2:
			    	ler.nextLine();
			    	System.out.println("\nInsira o nome do produto que deseja remover do invent�rio: ");
			    	String produtor = ler.nextLine();
			    	if(estoque2.contains(produtor)) {
			    		estoque2.remove(produtor);
			    	}
			    	else {
			    		System.out.println("\nO produto n�o existe.");
			    	}
			    	break;
			    case 3:
			    	ler.nextLine();
			    	System.out.println("\nInsira o produto que deseja atualizar:");
			    	String verifica = ler.nextLine();
			    	System.out.println("\nInsira o nome do produto que entrar� no lugar do produto removido: ");
			    	String novo = ler.nextLine();
			    	if(estoque2.contains(verifica)); {
			    	estoque2.remove(verifica);
			    	estoque2.add(novo);
			    	System.out.println(estoque2);
			    	break;
			    	}
			    case 4:
			    	ler.nextLine();
			    	System.out.println("\nMostrar produtos do estoque, al�m dos j� adicionados, que s�o: "+cam.getTipo()+", "+cal.getTipo()+", "+ten.getTipo()+".");
			    	System.out.println(estoque2);
			    	break;
			    	default:
			    	System.out.println("\nFinalizando o programa. (...)");			    	
			    }
		    } while(op!=0);
		}
	}
}
