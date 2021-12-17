package poo;

public class Estoque {
	
	private String nomeClasse;
    private String tipo;
	
	public Estoque(String nomeClasse, String tipo) {
		this.nomeClasse=nomeClasse;
		this.tipo=tipo;
	}
	public String getNomeClasse() {
		return nomeClasse;
	}
	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
 


