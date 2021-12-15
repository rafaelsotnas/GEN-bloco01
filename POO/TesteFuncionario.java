package poo;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario[] lista = new Funcionario[3];
		lista[0] = new Funcionario("\nCibele",50000);
		lista[1] = new Funcionario("\nScar",1000000);
		lista[2] = new Funcionario("\nBru",1000000);
		
		for(Funcionario roda:lista) {
			roda.imprimir();
		}
		System.out.println("\n**********************************************");
		
		for(Funcionario roda:lista) {
			roda.salarioM(10);
			roda.imprimir();
		}
	}

}
