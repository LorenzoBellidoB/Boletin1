package ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio7Test {

	@Test
	void testFecha1_1_1() {
		boolean res = Ejercicio7.fecha(1, 1, 1);
		assertTrue(res);
	}
	
	@Test
	void testFecha33_1_1() {
		boolean res = Ejercicio7.fecha(33, 1, 1);
		assertFalse(res);
	}
	
	@Test
	void testFecha1_14_1() {
		boolean res = Ejercicio7.fecha(1, 14, 1);
		assertFalse(res);
	}
	
	@Test
	void testFecha1_1_12() {
		boolean res = Ejercicio7.fecha(1, 1, -12);
		assertFalse(res);
	}
	
	@Test
	void testFechaSeptiembre() {
		boolean res = Ejercicio7.fecha(31, 9, 2024);
		assertFalse(res);
	}
	
	@Test
	void testFechaBisiesto() {
		boolean res = Ejercicio7.fecha(29, 2, 2024);
		assertTrue(res);
	}

}
