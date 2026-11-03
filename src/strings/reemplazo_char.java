package strings;

import java.util.Scanner;

public class reemplazo_char {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase o palabra:");
		String texto = scan.nextLine();
		
		System.out.println("Que caracter quieres reemplazar?:");
		String para_reemplazar = scan.nextLine();
		
		System.out.println("Por cual lo quieres reemplazar?:");
		String por_reemplazar = scan.nextLine();
		
		System.out.println(texto.replace(para_reemplazar, por_reemplazar));
		scan.close();
	}
}
