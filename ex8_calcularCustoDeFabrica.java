package ex_op.aritmeticos;

import java.util.Scanner;

public class ex8_calcularCustoDeFabrica {

        public static void main(String[] args){
	
	Scanner leia = new Scanner(System.in);
	
	double custo1, custo2; // porcentagem = 0.73
	
	System.out.println("\nCusto fábrica do carro: ");
	custo1 = leia.nextFloat();
	
	custo2 = custo1 + (custo1 * 0.73);
	
	System.out.println("\nO custo do carro para o consumidor é R$ "+custo2);

  }
}
