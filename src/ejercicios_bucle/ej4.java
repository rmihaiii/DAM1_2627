package ejercicios_bucle;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int resultado = 0;

		System.out.print("Introduce el primer numero:");
		int n1 = scan.nextInt();
		System.out.print("Introduce el segundo numero:");
		int n2 = scan.nextInt();
		
		for (int i = 0; i < n2; i++) {
			
			System.out.print(n1);
	        resultado = resultado + n1;

	        if (i < n2 - 1) {
	        	System.out.print("+");
	        	}
	        }

	        System.out.println("=" + resultado);	
	        
		scan.close();
		
	}
	

}