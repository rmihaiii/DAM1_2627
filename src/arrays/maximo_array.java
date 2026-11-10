package arrays;

import java.util.Scanner;

public class maximo_array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] listaNum = new int[7];
		int maximo = 0;

		for (int i = 0; i < listaNum.length; i++) {
			System.out.println("Introduce un numero");
			listaNum[i] = scan.nextInt();
		}

        for (int i = 0; i < listaNum.length; i++) {
            if (listaNum[i] > maximo) {
                maximo = listaNum[i];
            }
        }

        System.out.println("El numero maximo es: " + maximo);
        
        scan.close();
    }
}