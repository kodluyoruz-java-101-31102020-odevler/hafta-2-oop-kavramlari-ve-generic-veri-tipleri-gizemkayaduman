package soru3;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static Set<Integer> duplicateNumbers(int[] randomArray) {
		System.out.println('\n');
		System.out.println("Tekrarlanan Sayılar:");
		Set<Integer> numbers = new HashSet<Integer>();
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = i + 1; j < randomArray.length; j++) {
				if (randomArray[i] == randomArray[j]) {
					numbers.add(randomArray[i]);
					break;
				}

			}
		}
		return numbers;

	}

}