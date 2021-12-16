package poo;

public class Cachorro extends Animal {
	
	private int som=1;
	private int som2=0;
	private int correr=1;
	private int correr2=0;
	private boolean v1=true;
	private boolean v2=true;
	
	public Cachorro(String nome, String idade) {
        super(nome, idade);
		this.som=som;
		this.som2=som2;
		this.correr=correr;
		this.correr2=correr2;
		this.v1=v1;
		this.v2=v2;
    }

	public int getSom() {
		return som;
	}

	public void setSom(int som) {
		this.som = som;
	}

	public int getSom2() {
		return som2;
	}

	public void setSom2(int som2) {
		this.som2 = som2;
	}

	public int getCorrer() {
		return correr;
	}

	public void setCorrer(int correr) {
		this.correr = correr;
	}

	public int getCorrer2() {
		return correr2;
	}

	public void setCorrer2(int correr2) {
		this.correr2 = correr2;
	}
	public boolean getv1() {
		return v1;
	}

	public void setv1(boolean v1) {
		this.v1 = v1;
	}
	public boolean getv2() {
		return v2;
	}

	public void setv2(boolean v2) {
		this.v2 = v2;
	}
	
    public boolean v1(int correr) {
    	if(correr>correr2) {
    	return true; 
    	}
		return v1;
	}
    public boolean v2(int som) {
    	if(som>som2) {
    	return true; 
    	}
		return v2;
	}
    public void cachorroinfo1() {
        System.out.println("\nO nome do cachorro é "+getNome());
        System.out.println("\n"+getNome()+" tem "+getIdade());
        System.out.println("\nEle corre? "+getv1());
        System.out.println("\nLate? "+getv2());
   }
}