package heranca2;

public class Main {

	public static void main(String[] args) {
		
		Contador cont = new Contador("Danilo", "dsfgef", 2000, 2343);
		
		System.out.println(cont.calculoSalario(2000));
		
		Eletricista elet = new Eletricista("Danilo", "dsjfg", 2000, true);
		
		System.out.println(elet.calculoSalario(2000));
	}

}
