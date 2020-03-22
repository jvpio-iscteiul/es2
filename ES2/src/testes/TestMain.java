package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Stands.StandMain;

class TestMain {

	StandMain main; 
	
	@Test
	public void testMain() {
		main.main(null);
	}

}
