package matrices;

public class ej_prueba2 {

	public static void main(String[] args) {

		// Buscar grande, pequeño (y sus posiciones) y puntuacion por fila.

		int[][] puntos = new int[3][3];
		int fila_g = 0;
		int columna_g = 0;
		int fila_p = 0;
		int columna_p = 0;

		String persona = "Robert Mihai";

		// Robert Mihai
		puntos[0][0] = 89;
		puntos[0][1] = 99;
		puntos[0][2] = 96;

		// Marc Prats
		puntos[1][0] = 85;
		puntos[1][1] = 100;
		puntos[1][2] = 75;

		// Pol Camps
		puntos[2][0] = 45;
		puntos[2][1] = 50;
		puntos[2][2] = 61;

		int grande = puntos[0][0];
		int peque = puntos[0][0];

		for (int i = 0; i < puntos.length; i++) {
			if (persona.equals("Robert Mihai")) {
				System.out.print("Robert Mihai:  ");
				persona = "Marc Prats";
			} else if (persona.equals("Marc Prats")) {
				System.out.print("Marc Prats:    ");
				persona = "Pol Camps";
			} else if (persona.equals("Pol Camps")) {
				System.out.print("Pol Camps:     ");
			}
			for (int j = 0; j < puntos[i].length; j++) {
				System.out.print(puntos[i][j] + " ");
			}
			System.out.println("");
		}

		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				if (grande < puntos[i][j]) {
					grande = puntos[i][j];
					fila_g = i;
					columna_g = j;
				}
				if (peque > puntos[i][j]) {
					peque = puntos[i][j];
					fila_p = i;
					columna_p = j;
				}
			}
		}
		System.out.println("\n");
		System.out.println("Numero mas grande: " + grande + " fila " + fila_g + " columna " + columna_g);
		System.out.println("Numero mas pequeño: " + peque + " fila " + fila_p + " columna " + columna_p);
		System.out.println("\n");
		System.out.println("Total de Robert Mihai: " + (puntos[0][0] + puntos[0][1] + puntos[0][2]));
		System.out.println("Total de Marc Prats: " + (puntos[1][0] + puntos[1][1] + puntos[1][2]));
		System.out.println("Total de Pol Camps: " + (puntos[2][0] + puntos[2][1] + puntos[2][2]));
	}
}
