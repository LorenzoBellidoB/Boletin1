package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio1Test {

	@ParameterizedTest
	@MethodSource("vocalista")
	void testEsVocal(char caracter, boolean resEsperado) {
		boolean resObtenido = Ejercicio1.esVocal(caracter);
		assertEquals(resEsperado, resObtenido);
		
	}
	private static Stream<Arguments> vocalista(){
		return Stream.of(
				Arguments.of('a', true),
				Arguments.of('e', true),
				Arguments.of('i', true),
				Arguments.of('o', true),
				Arguments.of('u', true),
				Arguments.of('l', false)
				);
	}
	
//	@Test
//	void testEsVocalA() {
//		boolean resul = Ejercicio1.esVocal('a');
//		assertTrue(resul);
//	}
//
//	@Test
//	void testEsVocalE() {
//		boolean resul = Ejercicio1.esVocal('e');
//		assertTrue(resul);
//	}
//
//	@Test
//	void testEsVocalI() {
//		boolean resul = Ejercicio1.esVocal('i');
//		assertTrue(resul);
//	}
//
//	@Test
//	void testEsVocalO() {
//		boolean resul = Ejercicio1.esVocal('o');
//		assertTrue(resul);
//	}
//
//	@Test
//	void testEsVocalU() {
//		boolean resul = Ejercicio1.esVocal('u');
//		assertTrue(resul);
//	}
//
//	@Test
//	void testEsVocalConsonante() {
//		boolean resul = Ejercicio1.esVocal('l');
//		assertFalse(resul);
//	}

}
