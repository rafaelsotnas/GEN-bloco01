package poo;

import java.text.NumberFormat;

public class Funcionario {
	private String nome;
    private double salario;
    
    public Funcionario(String n, double s) {
    	this.setNome(n);
    	this.setSalario(s);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
    public void salarioM(double porcento) {
    	salario*=1+porcento/100;
    }
    public String formatarMoeda() {
    	NumberFormat nf = NumberFormat.getCurrencyInstance(); //transformar para moeda local
    	nf.setMinimumFractionDigits(2); //formata as casas decimais
    	String formatoMoeda = nf.format(salario); //formata a saída do valor
    	return formatoMoeda;
    }
    public void imprimir() {
    	System.out.println("\n"+nome+"\t\t"+salario+": "+this.formatarMoeda());
    }
}
