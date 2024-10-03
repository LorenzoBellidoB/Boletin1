package ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio6.Ejercicio6;

class Ejercicio10Test {
	
	@Test
	void testPalindroma() {
		boolean res = Ejercicio10.palindroma("");
		assertEquals(res, true);
	}

	@Test
	void testPalindromaala() {
		boolean res = Ejercicio10.palindroma("ala");
		assertEquals(res, true);
	}
	
	@Test
	void testPalindromahola() {
		boolean res = Ejercicio10.palindroma("hola");
		assertEquals(res, false);
	}

	@Test
	void testPalindromavariaspalabras() {
		boolean res = Ejercicio10.palindroma("hola hola");
		assertEquals(res, false);
	}
}
