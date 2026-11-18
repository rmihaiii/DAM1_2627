package matrices;

public class guardianes {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][4];
		
		// Star-Lord
		matriz[0][0] = 85;
		matriz[0][1] = 90;
		matriz[0][2] = 78;
		matriz[0][3] = 92;
		
		//Gamora
		matriz[1][0] = 95;
		matriz[1][1] = 88;
		matriz[1][2] = 91;
		matriz[1][3] = 87;
		
		//Rocket
		matriz[2][0] = 70;
		matriz[2][1] = 85;
		matriz[2][2] = 80;
		matriz[2][3] = 88;
		
		String guardian = "Star-Lord";
		
		int grande = matriz[0][0];
		int fila = 0;
		int columna = 0;
		int puntuacion = 0;
		
		System.out.println("=== TABLA DE PUNTUACIONES ===");

		for (int i = 0; i < matriz.length; i++) {
			if (guardian.equals("Star-Lord")) {
				System.out.print("Star-Lord: ");
				guardian = "Gamora";
			} else if (guardian.equals("Gamora")) {
				System.out.print("Gamora:    ");
				guardian = "Rocket";
			} else if (guardian.equals("Rocket")) {
				System.out.print("Rocket:    ");
			}
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		System.out.println("=== PUNTUACION TOTAL ===");
		System.out.println("Star-Lord: "+(matriz[0][0]+matriz[0][1]+matriz[0][2]+matriz[0][3]));
		System.out.println("Gamora: "+(matriz[1][0]+matriz[1][1]+matriz[1][2]+matriz[1][3]));
		System.out.println("Rocket: "+(matriz[2][0]+matriz[2][1]+matriz[2][2]+matriz[2][3]));

		System.out.println("\n");
		System.out.println("=== PUNTIACION MAS ALTA ===");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (grande < matriz[i][j]) {
					grande = matriz[i][j];
					fila = i;
					columna = j;
				}
				if (matriz[i][j] >= 90) {
					puntuacion++;
				}
			}
		}
		System.out.println("Mejor puntuacion: "+grande+" puntos");
		
		if (fila == 0) {
			guardian = "Star-Lord (fila 0)";
		} else if (fila == 1) {
			guardian = "Gamora (fila 1)";
		} else if (fila == 2) {
			guardian = "Rocket (fila 2)";
		}
		System.out.println("Guardian: "+guardian);
		System.out.println("Mision: " + columna);
		
		System.out.println("\n");
		System.out.println("=== PUNTUACIONES PERFECTAS (>= 90) ===");
		System.out.println("Total de puntuaciones perfectas: "+puntuacion);
	}

}
