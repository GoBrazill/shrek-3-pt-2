package abstracao;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		SerVivo s = new SerVivo();
//		s.respirar();
		
		SerVivo dog = new Cachorro();
		
		SerVivo tijolinho = new Humano();
		
		dog.setCor(Cores.AZUL);
		dog.getCor();
		
		tijolinho.respirar();
		dog.respirar();
		
		List<SerVivo> lista= new ArrayList<>();
		lista.add(tijolinho);
		lista.add(dog);
		
		for (SerVivo seres : lista) {
			System.out.println(seres);
		}
		
//		for (Cores cor : Cores.values()) {
//			System.out.println(cor + " " + cor.getI());
//		}
	}

}
