package ejercicio9;

public class Ejercicio9 {

	public static String binario(int num) {
		String res = "";
		
		if(num < 0) {
			throw new IllegalArgumentException("No se admiten numeros negativos");
		}else if (num == 0) {
	            res = "0";
	        } else if (num == 1) {
	            res = "1";
	        } else {
	            res = binario(num / 2) + (num % 2);
	            
	        }
		
		return res;
	}

	public static void main(String[] args) {
		System.out.println(binario(240));
	}
}
