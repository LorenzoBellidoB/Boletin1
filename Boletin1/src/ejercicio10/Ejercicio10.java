package ejercicio10;

public class Ejercicio10 {

	public static boolean palindroma(String frase) {
		
		boolean palindroma = false;

		String fraseNoEsp = "";

		String fraseAlr = "";

		for (int i = frase.length() - 1; i > -1; i--) {
			if (frase.charAt(i) != ' ') {
				fraseAlr += frase.charAt(i);
			}
		}
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				fraseNoEsp += frase.charAt(i);
			}
		}
		if (fraseNoEsp.equalsIgnoreCase(fraseAlr)) {
			palindroma = true;
		}

		return palindroma;
	}
	
}
