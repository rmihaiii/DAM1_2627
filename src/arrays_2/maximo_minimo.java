package arrays_2;

import java.util.Scanner;

public class maximo_minimo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] lista = new int[10];

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Llena el array:");

			lista[i] = scan.nextInt();
		}

		int grande = lista[0];
		int pequeño = lista[0];

		for (int i = 1; i < lista.length; i++) {

			if (lista[i] > grande) {
				grande = lista[i];
			}

			if (lista[i] < pequeño) {
				pequeño = lista[i];
			}
		}

		System.out.println("El num max es: " + grande);
		System.out.println("El num min es: " + pequeño);

		scan.close();
	}
}