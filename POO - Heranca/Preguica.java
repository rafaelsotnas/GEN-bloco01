package poo;

public class Preguica extends Animal {
	
	private int som5=1;
	private int som6=0;
	private int subir=1;
	private int subir2=0;
	boolean v5=true;
	boolean v6=true;
	
	public Preguica(String nome, String idade) {
        super(nome, idade);
		this.som5=som5;
		this.som6=som6;
		this.subir=subir;
		this.subir2=subir2;
		this.v5=v5;
		this.v6=v6;
    }

	public int getSom() {
		return som5;
	}

	public void setSom(int som5) {
		this.som5 = som5;
	}

	public int getSom6() {
		return som6;
	}

	public void setSom2(int som6) {
		this.som6 = som6;
	}

	public int getSubir() {
		return subir;
	}

	public void setSubir(int subir) {
		this.subir = subir;
	}

	public int getSubir2() {
		return subir2;
	}

	public void setSubir2(int subir2) {
		this.subir2 = subir2;
	}
	public boolean getv5() {
		return v5;
	}

	public void setv5(boolean v5) {
		this.v5 = v5;
	}
	public boolean getv6() {
		return v6;
	}

	public void setv6(boolean v6) {
		this.v6 = v6;
	}
	
    public boolean v5(int subir) {
    	if(subir>subir2) {
    	return true; 
    	}
		return v5;
	}
    public boolean v6(int som5) {
    	if(som5>som6) {
    	return true; 
    	}
        return v6; 
        }
    public void preguicainfo() {
            System.out.println("\nO nome do da preguiça é "+getNome());
            System.out.println("\n"+getNome()+" tem "+getIdade());
            System.out.println("\nEle escala árvores? "+getv5());
            System.out.println("\nFaz algum barulho que eu não sei o nome? "+getv6());
   }
}