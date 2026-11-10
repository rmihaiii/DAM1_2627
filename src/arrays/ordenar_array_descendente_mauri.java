package arrays;

public class ordenar_array_descendente_mauri {

	public static void main(String[] args) {

		int[] listaDesordenada = { 100, 599, 104, 55, 1 };
		int[] listaOrdenada = new int[listaDesordenada.length];

		int contador = 1;

		int grande = 0;
		int posGrande = 0;

		while (contador <= listaDesordenada.length) {

			for (int i = 0; i < listaDesordenada.length; i++) {
				if (grande < listaDesordenada[i]) {
					grande = listaDesordenada[i];
					posGrande = i;
				}
			}

			listaOrdenada[0] = grande;
			listaDesordenada[posGrande] = 0;
			grande = 0;
			posGrande = 0;

			contador++;

			System.out.println(listaOrdenada[grande]);
		}

	}

}
