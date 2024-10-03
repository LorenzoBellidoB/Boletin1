package ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio8.Ejercicio8;

class Ejercicio9Test {

	@Test
	void testBinario0() {
		String res = Ejercicio9.binario(0);
		assertEquals(res, "0");
	}
	
	@Test
	void testBinario1() {
		String res = Ejercicio9.binario(1);
		assertEquals(res, "1");
	}
	
	@Test
	void testBinario2() {
		String res = Ejercicio9.binario(2);
		assertEquals(res, "10");
	}
	
	@Test
	void testBinario240() {
		String res = Ejercicio9.binario(240);
		assertEquals(res, "11110000");
	}

	@Test
	void testBinarioError() {
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () ->
		Ejercicio9.binario(-12));
		
		assertEquals("No se admiten numeros negativos", exc.getMessage());
	}

}
