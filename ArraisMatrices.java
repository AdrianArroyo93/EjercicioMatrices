package ArraisMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class ArraisMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner escaner = new Scanner(System.in);

		int[][] matriz1 = new int[3][3];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				// matriz1[i][j] = i + 1;
				System.out.println("Escribe numero Matriz1 ");
				matriz1[i][j] = escaner.nextInt();
			}
		}

		int[][] matriz2 = new int[3][3];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				// matriz2[i][j] = i + 1;
				System.out.println("Escribe numero Matriz2 ");
				matriz2[i][j] = escaner.nextInt();

			}
		}

		/*
		 * CODIGO GITANO for (int i = 0; i < matriz1.length; i++) { for (int j = 0; j <
		 * matriz2.length; j++) { System.out.println("SumaPrimera" + matriz1[0][0] +
		 * matriz2[0][0]); System.out.println("SumaSegunda" + matriz1[1][1] +
		 * matriz2[1][1]); System.out.println("SumaTercera" + matriz1[2][2] +
		 * matriz2[2][2]); } }
		 */

		int[][] matriz3 = new int[3][3];
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3.length; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];

			}
		}

		for (int i = 0; i < matriz1.length; i++) {
			System.out.println(Arrays.toString(matriz1[i]));

		}
		System.out.println();
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println(Arrays.toString(matriz2[i]));

		}
		System.out.println();
		for (int i = 0; i < matriz3.length; i++) {
			System.out.println(Arrays.toString(matriz3[i]));

		}

	}

}

/*
 * Crear un programa en Java que tome dos matrices de tamaño 3x3 ingresadas por
 * el usuario, las sume y muestre el resultado. Deberemos de crear las dos
 * matrices y ir rellenando todos los números con valores dados por el usuario,
 * una vez que tengamos las dos matrices rellenas deberemos de sumar la posición
 * [0][0] de la primera matriz con la posición [0][0] de la segunda matriz
 */