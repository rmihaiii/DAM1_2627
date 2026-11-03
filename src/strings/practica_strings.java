package strings;

public class practica_strings {
	public static void main(String[] args) {
		
		String texto = "Hola";
		String texto2 = "Hola2";
		int contador = 0;
		
		for (int i = 0; i< texto.length(); i++) {
			char caracter = texto.charAt(i);
			System.out.println(caracter);
			
			if (caracter == 'a') {
				contador++;	
			}
		}
		System.out.println("Hay "+contador+" letras a");
		System.out.println(texto.concat(" ").concat(texto2));
	}
}
