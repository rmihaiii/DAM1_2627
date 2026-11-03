package strings;

import java.util.Scanner;

public class palabra_al_reves {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase o palabra:");
		String texto = scan.nextLine();

		for (int i = texto.length() - 1; i >= 0; i--) {
			char caracter = texto.charAt(i);
			System.out.println(caracter);
		}

		scan.close();
	}

}
