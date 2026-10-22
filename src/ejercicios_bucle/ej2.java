package ejercicios_bucle;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean espacio = false;
		String entrada = "";
		String[] vocales = { "a", "e", "i", "o", "u" };

		while (espacio == false) {

			System.out.println("Introduce un caracter");

			entrada = scan.nextLine();
			char letra = entrada.charAt(0);

			//System.out.println(letra);

			if (letra == ' ') {
				espacio = true;
				
			} else if (letra != ' ') {
				if ("aeiou".indexOf(letra) != -1) {
					System.out.println("Vocal");
				} else {
					System.out.println("No vocal");
				}
			}

		}

		scan.close();
	}

}
