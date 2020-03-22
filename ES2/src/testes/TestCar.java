package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Stands.Car;

class TestCar {

	Car carro; 
	private String model;
	private int year; 
	
	@Test
	void test() {
		model="Audi";
		year=2000;
		carro = new Car(model, year);
	}
	
}