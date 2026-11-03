package strings;

import java.util.Scanner;

public class iterar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String palabra = "";

		System.out.println("Introduce una palabra: ");
		palabra = scan.nextLine();

		if (palabra.toUpperCase().equals(palabra)) {

			palabra = palabra.toLowerCase();
			System.out.println("Tu palabra estaba en mayusculas / " + palabra);
		} else if (palabra.toLowerCase().equals(palabra)) {

			palabra = palabra.toUpperCase();
			System.out.println("Tu palabra estaba en minusculas / " + palabra);
		} else {
			System.out.println("Tu palabra contenia mayusculas y minusculas, se queda igual");
		}

		for (int i = 0; i < palabra.length(); i++) {

			char letra = palabra.charAt(i);
			System.out.println(letra);

		}

		scan.close();
	}
}
