package poo;

public class Tenis extends Estoque implements Inventario {
	
	public Tenis(String nomeClasse, String tipo) {
		super(nomeClasse, tipo);
		nomeClasse="Cal�ado";
	}
	@Override
	public String getTipo() {
		return "t�nis";
	}

}
