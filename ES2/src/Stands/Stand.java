package Stands;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Stand.
 */
public class Stand {
	
	/** The name. */
	private String name; 
	 
	/** The car list. */
	private ArrayList<Car> carList;
	
	/** The balance. */
	private int balance;
	
	/**
	 * Instantiates a new stand.
	 *
	 * @param name the name
	 * @param initialBalance the initial balance
	 */
	// Construtor
	public Stand(String name, int initialBalance) {
		balance = initialBalance;
		this.name = name;
		carList = new ArrayList<Car>();
	}
	
	
	/**
	 * Buy car.
	 *
	 * @param c the c
	 * @param value the value
	 */
	// Método que simula a compra de um carro - só compra se houver dinheiro para isso
	public void buyCar(Car c, int value) {
		if (balance - value >= 0) {
			balance -= value;
			carList.add(c);
		}
	}
	
	/**
	 * Sell car.
	 *
	 * @param c the c
	 * @param value the value
	 */
	// Método que simula a venda de um carro
	public void sellCar(Car c, int value) {
		balance += value;
		carList.remove(c);
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		
		String toReturn = "";
		
		toReturn += "Stand " + name + ":" + System.lineSeparator();
		toReturn += "Balance = " + balance + "Euros" + System.lineSeparator();  
		
		for (Car c: carList)
			toReturn += c + System.lineSeparator();  
		
		return toReturn;
	}
}
