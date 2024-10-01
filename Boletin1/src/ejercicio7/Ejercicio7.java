package ejercicio7;

import java.time.Year;

public class Ejercicio7 {

	public static boolean fecha(int dia, int mes, int anho) {
		boolean res = false;
		
		switch(mes) {
		case 1,3,5,7,8,10,12 ->{
			if(dia <= 31 && dia > 0 && anho > 0) {
				res = true;
			}
		}
		case 2 ->{
			if(dia <= 28 && dia > 0 && anho > 0) {
				res = true;
			}else if(dia <= 29 && dia > 0 && Year.isLeap(anho)) {
				res = true;
			}
		}
		case 4,6,9,11 ->{
			if(dia <= 30 && dia > 0 && anho > 0) {
				res = true;
			}
		}
		
		}
		
		return res;
	}
}
