package arrays;

import java.util.Scanner;

public class ordenar_array_descendiente {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un numero:");
			numeros[i] = scan.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {

				if (numeros[i] < numeros[j]) {
					int auxiliar = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = auxiliar;
				}

			}
		}

		System.out.println("Array ordenado de mayor a menor:");

		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}

		scan.close();
	}
}