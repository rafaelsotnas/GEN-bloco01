package poo;

public class TesteCliente {
	public static void main(String[] args) {
        	
		Cliente cliente1 = new Cliente("Jonas","8134");
		System.out.println(cliente1.getinfo());
		cliente1.compra();
	}
}
