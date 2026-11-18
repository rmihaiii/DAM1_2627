package matrices;

//import java.util.Random;
import java.util.Scanner;

public class tres_en_raya {

	public static void main(String[] args) {

		Scanner scan_l = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);

		String[][] tablero = new String[3][3];
		String J1 = "X";
		String J2 = "O";

		int fila = 0;
		int columna = 0;

		boolean turno = true;

		System.out.println("Introduce una fila: (0-2)");
		fila = scan_n.nextInt();

		System.out.println("Introduce una columna: (0-2)");
		columna = scan_l.nextInt();

		tablero[fila][columna] = J1;

		while (!tablero[fila][columna].equals(null)) {
			System.out.println("Posicion ocupada");

			System.out.println("Introduce una fila: (0-2)");
			fila = scan_n.nextInt();

			System.out.println("Introduce una columna: (0-2)");
			columna = scan_l.nextInt();
		}

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
		if (tablero[0][0].equals(tablero[0][1]) && tablero[0][0].equals(tablero[0][2])) {
			System.out.println("Ganador");
		} else if (!tablero[1][0].equals(tablero[1][1]) && tablero[1][0].equals(tablero[1][2])) {
			System.out.println("Ganador");
		}
	}

}
