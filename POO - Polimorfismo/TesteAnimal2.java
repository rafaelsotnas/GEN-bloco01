package poo;

public class TesteAnimal2 {

	public static void main(String[] args) {

		Cachorro2 dog = new Cachorro2("Snoop","late.");
		Cavalo2 pangare = new Cavalo2("Alípio", "relincha.");
		Preguica2 preg = new Preguica2("Sid", "som esquisito.");
		
		System.out.println("\n"+dog.getNome()+" "+dog.getSom());
        System.out.println("\n"+pangare.getNome()+" "+pangare.getSom());
		System.out.println("\n"+preg.getNome()+" faz um "+preg.getSom());
	}
}
