package poo;

public class Produto {

	private String nome;
	private String produto;
	private String marca;

	public Produto(String nome, String produto, String marca) {
		this.nome = nome;
		this.produto = produto;
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void imprimirInfo() {
    	System.out.println("\n"+nome+" comprou uma "+produto+" da marca "+marca+" mês passado.");
	}
}
