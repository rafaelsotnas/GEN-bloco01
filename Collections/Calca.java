package poo;

public class Calca extends Estoque implements Inventario {
	
	public Calca(String nomeClasse, String tipo) {
		super(nomeClasse, tipo);
		nomeClasse="Vestu�rio";
	}
	@Override
	public String getTipo() {
		return "cal�a";
	}

}
