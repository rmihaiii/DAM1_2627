package arrays;

import java.util.Scanner;

public class prueba_array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//tipo nombre = valor
		int numero = 1;
		
		System.out.println("Introduce el tamaño para la array: ");
		
		//tipo[] nombre = new tipo[tamaño]
		int[] lista_n = new int[scan.nextInt()];
		String[] lista_p = new String[10];
		
		//String.length() / array.length -- Array sin ()
		int longitud = lista_n.length;
		
		System.out.println(longitud);
		
		//String.charAt(i) / array[i]
	
		
		lista_n[0] = 9;
		lista_n[1] = 99;
		lista_n[2] = 999;
		lista_n[3] = 9999;
		lista_n[4] = 99999;

		lista_n[4]++;
		lista_n[3] = lista_n[3]/lista_n[2]+lista_n[1];
		
		for (int i = 0; i< lista_n.length; i++) {
			System.out.println(lista_n[i]);
		}
		
		System.out.println(lista_n[0]);
		System.out.println(lista_n[1]);
		System.out.println(lista_n[2]);
		System.out.println(lista_n[3]);
		System.out.println(lista_n[4]);
	}

}
