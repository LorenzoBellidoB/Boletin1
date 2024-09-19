package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio4Test {

	@Test
	void testEsPrimo3() {
		boolean res = Ejercicio4.esPrimo(3);
		
		assertTrue(res);
	}
	
	@Test
	void testEsPrimo5() {
		boolean res = Ejercicio4.esPrimo(5);
		
		assertTrue(res);
	}
	
	@Test
	void testEsPrimo4() {
		boolean res = Ejercicio4.esPrimo(4);
		
		assertFalse(res);
	}
	
	@Test
	void testEsPrimo9() {
		boolean res = Ejercicio4.esPrimo(9);
		
		assertFalse(res);
	}
	
	@Test
	void testEsPrimo15() {
		boolean res = Ejercicio4.esPrimo(15);
		
		assertFalse(res);
	}

}
