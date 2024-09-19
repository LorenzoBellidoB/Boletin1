package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	void testEsPar2() {
		boolean res = Ejercicio2.esPar(2);
		assertTrue(res);
	}
	
	@Test
	void testEsPar1() {
		boolean res = Ejercicio2.esPar(1);
		assertFalse(res);
	}

	@Test
	void testEsPar4() {
		boolean res = Ejercicio2.esPar(4);
		assertTrue(res);
	}
	
	@Test
	void testEsPar3() {
		boolean res = Ejercicio2.esPar(3);
		assertFalse(res);
	}
	
	@Test
	void testEsPar0() {
		boolean res = Ejercicio2.esPar(0);
		assertTrue(res);
	}
}
