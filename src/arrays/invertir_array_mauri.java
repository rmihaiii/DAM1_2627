package arrays;

public class invertir_array_mauri {

	public static void main(String[] args) {

		int[] listaN = {69,100,403,999,100000};
		
		//Empezar desde listaN.length (5) pero no existe por eso se le resta 1. En una lista de 5 la ultima posicion es la 4.
		for (int i = listaN.length-1; i >= 0; i--) {
			System.out.println(listaN[i]);
		}
	}
}
