package ejercicio1;

public class Ejercicio1 {

	public static boolean esVocal(char caracter) {
		boolean res = false;
		char vocalMinuscula = Character.toLowerCase(caracter);
	
		switch(vocalMinuscula) {
		case 'a', 'e', 'i', 'o', 'u'-> res = true; 
		}
		
		return res;
	}
}
