package strings;

import java.util.Scanner;

public class contador_vocales {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int contador = 0;

		System.out.println("Introduce una frase o palabra:");
		String texto = scan.nextLine();

		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);

			if (caracter == 'a') {
				contador++;
			} else if (caracter == 'e') {
				contador++;
			} else if (caracter == 'i') {
				contador++;
			} else if (caracter == 'o') {
				contador++;
			} else if (caracter == 'u') {
				contador++;
			}

		}
		System.out.println("Contador de vocales: "+contador);
		scan.close();
	}

}
