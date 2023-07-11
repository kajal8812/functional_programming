package programming;

import java.util.List;

public class FP02OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printOddNumbers(List.of(1, 3, 5, 6, 2, 3, 4, 8));
	}

	private static void printOddNumbers(List<Integer> list) {
		list.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

}
