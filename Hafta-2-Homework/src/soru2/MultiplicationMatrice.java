package soru2;

public class MultiplicationMatrice {
	
	static int[][] resultMatrice;
	
	public static int[][] MultiplyMatrice(int[][] matrice1,int[][] matrice2) {
		resultMatrice = new int[matrice1.length][matrice2[0].length];
			for (int i = 0; i < matrice1.length; i++) {
	            for (int j = 0; j < matrice2[0].length; j++) {
	                for (int k = 0; k < matrice1[0].length; k++) {
	                    resultMatrice[i][j] += matrice1[i][k] * matrice2[k][j];
	                }
	            }
	        }
	       return resultMatrice;
	}

}
