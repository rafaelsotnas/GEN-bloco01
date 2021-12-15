package poo;

public class Cavalo extends Animal {

	private int som3=1;
	private int som4=0;
	private int correr3=1;
	private int correr4=0;
	boolean v3=true;
	boolean v4=true;
	
	public Cavalo(String nome, String idade) {
        super(nome, idade);
		this.som3=som3;
		this.som4=som4;
		this.correr3=correr3;
		this.correr4=correr4;
		this.v3=v3;
		this.v4=v4;
    }

	public int getSom() {
		return som3;
	}

	public void setSom(int som3) {
		this.som3 = som3;
	}

	public int getSom4() {
		return som4;
	}

	public void setSom2(int som4) {
		this.som4 = som4;
	}

	public int getCorrer() {
		return correr3;
	}

	public void setCorrer(int correr3) {
		this.correr3 = correr3;
	}

	public int getCorrer4() {
		return correr4;
	}

	public void setCorrer2(int correr4) {
		this.correr4 = correr4;
	}
	public boolean getv3() {
		return v3;
	}

	public void setv3(boolean v3) {
		this.v3 = v3;
	}
	public boolean getv4() {
		return v4;
	}

	public void setv4(boolean v4) {
		this.v4 = v4;
	}
	
    public boolean v3(int correr3) {
    	if(correr3>correr4) {
        	return true; 
        	}
    		return v3;
    	}
        public boolean v2(int som) {
        	if(som3>som4) {
        	return true; 
        	}
    		return v4;
	}
    public void cavaloinfo() {
            System.out.println("\nO nome do pangaré é "+getNome());
            System.out.println("\n"+getNome()+" tem "+getIdade());
            System.out.println("\nEle corre? "+getv3());
            System.out.println("\nRelincha? "+getv4());
   }
}