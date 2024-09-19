package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio3Test {

	@Test
	void testMultiploCadenaTres() {
		String res = Ejercicio3.multiploCadena(3);

		assertEquals("fizz", res);
	}

	@Test
	void testMultiploCadenaSeis() {
		String res = Ejercicio3.multiploCadena(6);

		assertEquals("fizz", res);
	}
	
	@Test
	void testMultiploCadenaCinco() {
		String res = Ejercicio3.multiploCadena(5);

		assertEquals("buzz", res);
	}
	
	@Test
	void testMultiploCadenaDiez() {
		String res = Ejercicio3.multiploCadena(10);

		assertEquals("buzz", res);
	}
	
	@Test
	void testMultiploCadenaQuince() {
		String res = Ejercicio3.multiploCadena(15);

		assertEquals("fizzbuzz", res);
	}

}