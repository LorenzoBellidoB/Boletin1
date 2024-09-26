package ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Ejercicio6Test {

	@Test
	void testCalculadoraOpc1() {
		double res = Ejercicio6.calculadora(1, 2, 1);
		assertEquals(res, 3);
	}
	
	@Test
	void testCalculadoraOpc2() {
		double res = Ejercicio6.calculadora(4, 2, 2);
		assertEquals(res, 2);
	}
	
	@Test
	void testCalculadoraOpc3() {
		double res = Ejercicio6.calculadora(2, 2, 3);
		assertEquals(res, 4);
	}
	
	@Test
	void testCalculadoraOpc4() {
		double res = Ejercicio6.calculadora(4, 2, 4);
		assertEquals(res, 2);
	}
	
	@Test
	void testCalculadoraDivisionPor0() {
		ArithmeticException exc = assertThrows(ArithmeticException.class, () ->
		Ejercicio6.calculadora(4, 0, 4));
		
		assertEquals("División por 0", exc.getMessage());
	}

	@Test
	void testCalculadoraError() {
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () ->
		Ejercicio6.calculadora(4, 0, 7));
		
		assertEquals("Valor no comprendido", exc.getMessage());
	}

}
