package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Stands.Stand;

class TestStand {
	
	Stand stand; 
	
	@Test
	void test() {
		stand = new Stand ("ola", 1000);
	}

}
