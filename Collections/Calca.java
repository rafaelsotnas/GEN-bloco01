package poo;

public class Calca extends Estoque implements Inventario {
	
	public Calca(String nomeClasse, String tipo) {
		super(nomeClasse, tipo);
		nomeClasse="Vestuário";
	}
	@Override
	public String getTipo() {
		return "calça";
	}

}
