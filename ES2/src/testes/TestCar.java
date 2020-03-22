package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Stands.Car;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCar.
 */
class TestCar {

	/** The carro. */
	Car carro; 
	
	/** The model. */
	private String model;
	
	/** The year. */
	private int year; 
	
	/**
	 * Test.
	 */
	@Test
	void test() {
		model="Audi";
		year=2000;
		carro = new Car(model, year);
	}
	
}