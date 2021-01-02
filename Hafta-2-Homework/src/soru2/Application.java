package soru2;

import java.util.Random;
import java.util.Scanner;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[][] matrice1;
		int[][] matrice2;

		Scanner scanner = new Scanner(System.in);

		System.out.print("N:");
		int N = scanner.nextInt();

		System.out.print("M:");
		int M = scanner.nextInt();

		System.out.print("T:");
		int T = scanner.nextInt();

		matrice1 = new int[N][M];
		matrice2 = new int[M][T];

		matrice1 = fillMatrice(matrice1);
		matrice2 = fillMatrice(matrice2);
		
		System.out.println("----1.Matris----");
		printMatrice(matrice1);
		System.out.println("-----2.Matris-----");
		printMatrice(matrice2);
		
		System.out.println("----Matrislerin Çarpımı----");
		printMatrice(MultiplicationMatrice.MultiplyMatrice(matrice1, matrice2));
	}

	public static int[][] fillMatrice(int[][] matrice) {
		int rowSize = matrice.length;
		int columnSize = matrice[0].length;
		Random random = new Random();
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {

				matrice[i][j] = random.nextInt(11);
			}
		}
		return matrice;
	}

	public static void printMatrice(int[][] matrice) {
		int rowSize = matrice.length;
		int columnSize = matrice[0].length;
		
		for(int i=0; i < rowSize; i++) {
			for(int j=0; j < columnSize; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

}
