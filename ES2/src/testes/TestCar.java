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
	private String model = "Audi";
	
	/** The year. */
	private int year = 2000; 
	
	/**
	 * Test.
	 */
	@Test
	void test() {
		carro = new Car(model, year);
		carro.equals(carro);
		assertEquals(2000,year);
		assertEquals("Audi", carro.getModel());
		assertEquals(17, carro.getAgeInYears());
	}
	
}