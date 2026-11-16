package matrices;

import java.util.Scanner;

public class ej_prueba {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] listaN = new int[5];

		for (int i = 0; i < listaN.length; i++) {
			System.out.println("Introduce un numero entero");
			listaN[i] = scan.nextInt();
		}

		int grande = listaN[0]; //Para partir desde el primer elemento.
		int peque = listaN[0]; //Para partir desde el primer elemento. 
		int posicion_g = 0;
		int posicion_p = 0;
		
		System.out.println("\n");

		for (int i = 0; i < listaN.length; i++) {
			System.out.println(listaN[i]);
		}
		System.out.println("Length: " + listaN.length);
		
		
		for (int i = 0; i < listaN.length; i++) {
			if (listaN[i] > grande) {
				grande = listaN[i];
				posicion_g = i;
				
			}
			if (listaN[i] < peque) {
				peque = listaN[i];
				posicion_p = i;
			}
				
			}
		System.out.println("Numero grande: "+grande+" posicion en la array: "+posicion_g);
		System.out.println("Numero pequeño: "+peque+" posicion en la array: "+posicion_p);
	}

}
