package ejercicio8;

public class Ejercicio8 {

	public static int fibonacci(int n) {
		int res;

		if (n == 1 || n == 2) {
			res = 1;
		}else if(n < 1) {
			throw new IllegalArgumentException("No estan comprendidos los números menores a 1");
		}
		else {
			res = fibonacci(n - 1) + fibonacci(n - 2);			
		}

		return res;
	}
}
