
// TODO: Auto-generated Javadoc
/**
 * The Class StandMain.
 */
public class StandMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		// Criação de 5 objectos Car e dois objectos Stand
		Car c1 = new Car("Opel Corsa", 2014);
		Car c2 = new Car("Toyota Auris", 2010);
		Car c3 = new Car("Porsche 911", 1990);
		Car c4 = new Car("Audi A3", 2008);
		Car c5 = new Car("Papa reformas", 2010);
			
		Stand s1 = new Stand("Auto Lopes, Lda.", 10000);
		Stand s2 = new Stand("Rei Leão das Patilhas", 20000);
		
		// Dados iniciais dos Stands
		System.out.println("**************** estado inicial dos stands ****************");
		System.out.println(s1);
		System.out.println(s2);
		
		
		// Fazer umas transacções
		s1.buyCar(c1, 5000);
		s1.buyCar(c3, 40000);
		s2.buyCar(c2, 10000);
		
		s1.sellCar(c1, 7000);
		s2.sellCar(c2, 12000);
		
		s1.buyCar(c4, 8000);
		s1.buyCar(c5, 300);
		s2.buyCar(c3, 21000);
		
		System.out.println("\n********************* após transações *********************");
		System.out.println(s1);
		System.out.println(s2);
		
		// Coisas extra: testar getAgeInYears e uso da constante currentYear
		System.out.println("O " + c1 + " tem " + c1.getAgeInYears() + " anos");
		System.out.println("O ano corrente é " + Car.currentYear);
		
	}

}
