package poo;

public class TesteAnimal {
	public static void main(String[] args) {
		
        Cachorro dogg = new Cachorro("Snoop Doggy Dogg","9 anos");
        dogg.cachorroinfo1();
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||");
        Preguica sidd = new Preguica("Sid","6 anos");
        sidd.preguicainfo();
        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||");
        Cavalo pangare = new Cavalo("Alípio","46 anos");
        pangare.cavaloinfo();
        

	}

}
