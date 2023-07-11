package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbers(List.of(3, 5, 6, 6, 7, 2, 6, 8, 2));

	}

	private static void printAllNumbers(List<Integer> numbers) {

		for (int i : numbers) {
			if (i % 2 == 0) {

				System.out.println(i + " ");
			}

		}
	}

}
