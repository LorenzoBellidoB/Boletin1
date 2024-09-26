package ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio5Test {
	
	@Test
	void testEsCapicua4() {
		boolean res = Ejercicio5.esCapicua(4);
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua9() {
		boolean res = Ejercicio5.esCapicua(9);
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua44() {
		boolean res = Ejercicio5.esCapicua(44);
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua37() {
		boolean res = Ejercicio5.esCapicua(37);
		assertFalse(res);
	}

	@Test
	void testEsCapicua404() {
		boolean res = Ejercicio5.esCapicua(404);
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua123() {
		boolean res = Ejercicio5.esCapicua(123);
		assertFalse(res);
	}
	
	@Test
	void testEsCapicua1234() {
		boolean res = Ejercicio5.esCapicua(1234);
		assertFalse(res);
	}
	
	@Test
	void testEsCapicua4004() {
		boolean res = Ejercicio5.esCapicua(4004);
		assertTrue(res);
	}
	
}
