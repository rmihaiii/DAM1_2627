package arrays;

import java.util.Scanner;

public class contar_pares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el numero " + (i + 1) + ":");
            numeros[i] = scan.nextInt();
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Numeros pares: " + contador);

        scan.close();
    }
}