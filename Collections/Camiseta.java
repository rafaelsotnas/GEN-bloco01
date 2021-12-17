package poo;

public class Camiseta extends Estoque implements Inventario {
	
	public Camiseta(String nomeClasse, String tipo) {
		super(nomeClasse, tipo);
		nomeClasse="Vestuário";
	}
	@Override
	public String getTipo() {
		return "camiseta";
	}

}
