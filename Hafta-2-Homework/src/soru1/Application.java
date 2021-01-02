package soru1;

public class Application {

	public static void main(String[] args) {
		int matrice[][] = { { 1, 2, 3, 4, 5 }, 
				        { 16, 17, 18, 19, 6 }, 
				        { 15, 24, 25, 20, 7 }, 
				        { 14, 23, 22, 21, 8 },
				        { 13, 12, 11, 10, 9 } };

		// Function Call
		SpiralMatrix.print(matrice, 0, 0, 5, 5);

	}

}
