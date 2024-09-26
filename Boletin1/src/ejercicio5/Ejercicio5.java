package ejercicio5;

public class Ejercicio5 {

	public static boolean esCapicua(int num) {
		
		boolean res = false;
		int cifra = 0;
		int inverso = 0;
		int aux = num;
		
		if(num >=0 && num <= 9999) {
			
			while(aux!=0) {
				
				cifra = aux % 10;
			
				inverso = inverso * 10 + cifra;
				
				aux = aux / 10;
			}
		
			if(num == inverso) { 
				res = true;
			}else { 
				res = false;
			}
		}else { 
			System.err.println("ERROR");
		}
		return res;
	}
}
