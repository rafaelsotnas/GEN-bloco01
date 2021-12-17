package poo;

public class Tenis extends Estoque implements Inventario {
	
	public Tenis(String nomeClasse, String tipo) {
		super(nomeClasse, tipo);
		nomeClasse="Calçado";
	}
	@Override
	public String getTipo() {
		return "tênis";
	}

}
