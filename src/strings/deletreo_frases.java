package strings;

import java.util.Scanner;

public class deletreo_frases {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase o palabra:");
		String texto = scan.nextLine();

		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			System.out.println(caracter);
		}
		scan.close();
	}

}
