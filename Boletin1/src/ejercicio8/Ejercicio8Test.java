package ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio6.Ejercicio6;
import ejercicio7.Ejercicio7;

class Ejercicio8Test {

	@Test
	void fibonacci0() {
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () ->
		Ejercicio8.fibonacci(0));
		
		assertEquals("No estan comprendidos los números menores a 1", exc.getMessage());
	}
	
	@Test
	void fibonacci1() {
		int res = Ejercicio8.fibonacci(1);
		assertEquals(res, 1);;
	}
	
	@Test
	void fibonacci2() {
		int res = Ejercicio8.fibonacci(2);
		assertEquals(res, 1);;
	}
	
	@Test
	void fibonacci5() {
		int res = Ejercicio8.fibonacci(5);
		assertEquals(res, 5);;
	}
	
	@Test
	void fibonacci8() {
		int res = Ejercicio8.fibonacci(20);
		assertEquals(res, 6765);;
	}
	

}
