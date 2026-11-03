package strings;

public class marcel {

	public static void main(String[] args) {

		String palabra = "GUILLEM";

		System.out.println("Recorriendo la palabra: " + palabra);

		for (int i = 0; i < palabra.length(); i++) {

			char letra = palabra.charAt(i);

			System.out.println("Posición " + i + ": " + letra);

		}

	}

}
