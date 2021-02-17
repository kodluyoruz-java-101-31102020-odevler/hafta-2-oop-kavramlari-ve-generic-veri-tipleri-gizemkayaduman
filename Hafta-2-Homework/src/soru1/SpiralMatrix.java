package soru1;

public class SpiralMatrix {
	static int R;
	static int C;

	// i, j: Start index of matrix, row and column respectively m, n: End index of matrix row and column respectively
	static void print(int array[][], int i, int j, int m, int n) {
		
		
		// Print First Row
		for (int p = i; p < n; p++) {
			System.out.print(array[i][p] + " ");
		}

		// Print Last Column
		for (int p = i + 1; p < m; p++) {
			System.out.print(array[p][n - 1] + " ");
		}

		// Print Last Row, if Last and
		// First Row are not same
		if ((m - 1) != i) {
			for (int p = n - 2; p >= j; p--) {
				System.out.print(array[m - 1][p] + " ");
			}
		}

		// Print First Column, if Last and
		// First Column are not same
		if ((n - 1) != j) {
			for (int p = m - 2; p > i; p--) {
				System.out.print(array[p][j] + " ");
			}
		}
		print(array, i + 1, j + 1, m - 1, n - 1);
	}
}
