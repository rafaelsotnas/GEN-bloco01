package poo;

import java.util.Scanner;

public class Cliente {
	Scanner ler = new Scanner(System.in);
	
	double vp, vt;
	private String nome;
	private String codigo;
	
	public Cliente(String n, String codigo) {
		this.nome = n;
		this.codigo = codigo;
	   }
	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	public double getVp() {
		return vp;
	}
	public void setVp(double vp) {
		this.vp = vp;
	}
	public double getVt() {
		return vt;
	}
	public void setVt(double vt) {
		this.vt = vt;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double valor(double vt) {
		System.out.println("\nO valor de cada produto deve ser inserido individualmente\n");
	
	do {
		System.out.println("\nInsira o valor do produto: ");
		vp = ler.nextDouble();
		vt = vt + vp;
	} while(vp>0.0); {
		return vt; }
	}
	public String getinfo() {
		String info = nome + "\t\t"+codigo;
		return info;
	}
	public void compra() {
		System.out.printf("\nTotal: %.2f",valor(0.0));
	}
}
