package arrays_2;

import java.util.Scanner;

public class consultar_valor_array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] listaN = {1,2,3,4,5};
		
		System.out.println("Introduce una posicion");
		int pos = scan.nextInt();
		
		while (pos < 0 || pos>listaN.length) {
			System.out.println("Posicion incorrecta, introduce otra");
			pos = scan.nextInt();
		}
		
		System.out.println("En la posicion "+pos+ " esta "+listaN[pos]);
	}

}
