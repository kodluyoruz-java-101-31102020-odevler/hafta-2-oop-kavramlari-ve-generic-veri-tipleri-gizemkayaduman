package soru3;

import java.util.Random;
import java.util.Set;

public class Application {

	public static void main(String[] args) {

		//rastgele sayılardan oluşan diziyi oluşurup ekrana yazdıralım.
		int[] randomArray = new int[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int sayi = random.nextInt(11);
			randomArray[i] = sayi;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(randomArray[i] + " ");
		}

		//tekrar eden elemanları bulalım.
		printAll(DuplicateElements.duplicateNumbers(randomArray));
		
	}
	
		public static <Integer> void printAll(Set<Integer> set){
			
			for(Integer item : set) {
				
				System.out.println(item);
			}
			System.out.println();
		}
}

