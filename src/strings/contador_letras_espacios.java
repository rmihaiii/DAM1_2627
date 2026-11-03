package strings;

import java.util.Scanner;

public class contador_letras_espacios {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int contador = 0;
		int contador_espacio = 0;

		System.out.println("Introduce una frase o palabra:");
		String texto = scan.nextLine();

		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);

			if (caracter != ' ') {
				contador++;
			} else if (caracter == ' ') {
				contador_espacio++;
			}

		}
		System.out.println("Contador letras: " + contador + "\nContador espacios: " + contador_espacio);
		scan.close();
	}

}
