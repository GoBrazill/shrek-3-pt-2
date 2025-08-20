package heranca;

public class Main {

	public static void main(String[] args) {

		Engenheiro eng = new Engenheiro("Denis", "138753259", 7000, 547821);
		
		System.out.println(eng.getNome());
		
		eng.setNome("Eugene");
		
		System.out.println(eng.getNome());
	}

}
