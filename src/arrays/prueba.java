package arrays;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {

		Scanner scanN = new Scanner(System.in);
		Scanner scanL = new Scanner(System.in);
		
		int tamaño = 0;
		int posicion = 0;
		
		System.out.println("Cuantos nombres quieres?");
		tamaño = scanN.nextInt();
		
		String[] listaN = new String[tamaño];
		
		for (int i = 0; i < listaN.length; i++) {
			System.out.println("Dame un nombre:");
			listaN[i] = scanL.nextLine();
		}
		
		System.out.println("Introduce una posicion (Del 0 al "+(tamaño-1)+")");
		posicion = scanN.nextInt();
		
		while (posicion >= listaN.length) {
			System.out.println("Posicion invalida, introduce otro numero");
			posicion = scanN.nextInt();
		}
		
		System.out.println("En la posicion "+posicion+" esta "+listaN[posicion]);
		
		scanN.close();
		scanL.close();
	}

}
