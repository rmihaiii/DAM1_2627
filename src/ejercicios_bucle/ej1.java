package ejercicios_bucle;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int cantidad = 0;
		int num = 0;
		int contador_negativo = 0;
		int contador_positivo = 0;
		int contador_0 = 0;
		
		System.out.println("Cuantos numeros quieres introducir?");
		cantidad = scan.nextInt();
		
		for(cantidad=cantidad; cantidad != 0; cantidad--) {
			
			System.out.println("Introduce un numero");
			num = scan.nextInt();
			
			if (num > 0) {
				contador_positivo++;
			} else if (num < 0 ) {
				contador_negativo++;
			} else if (num == 0) {
				contador_0++;
			}
		}
		
		
		System.out.println("Numeros mayores que 0: "+contador_positivo+". Numeros menores que 0: "+contador_negativo+". Y numeros iguales a 0: "+contador_0);
		scan.close();
	}
	
}
