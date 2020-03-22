package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Stands.Stand;

// TODO: Auto-generated Javadoc
/**
 * The Class TestStand.
 */
class TestStand {
	
	/** The stand. */
	Stand stand; 
	
	/**
	 * Test.
	 */
	@Test
	void test() {
		stand = new Stand ("ola", 1000);
	}

}
