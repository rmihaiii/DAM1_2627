package arrays;

import java.util.Scanner;

public class sumas_array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] listaNum = new int[5];
		int resultado = 0;
		
		
		for (int i = 0; i < listaNum.length; i++) {
			System.out.println("Introduce un numero");
			listaNum[i] = scan.nextInt();
			resultado = resultado + listaNum[i];
		}
		
		System.out.println("El total de la suma es de: "+resultado);
		
		scan.close();
	}

}
