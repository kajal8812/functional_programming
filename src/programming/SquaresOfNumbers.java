package programming;

import java.util.List;

public class SquaresOfNumbers {

	public static void main(String[] args) {

		//squaresOfEvenNumbers(List.of(1, 2, 3, 4, 5, 6));
		//cubesOfOddNumbers(List.of(1, 2, 3, 4, 5, 6));
		numberOfCharactersInEachCourse(List.of("spring", "spring mvc", "aes"));
	}

	private static void numberOfCharactersInEachCourse(List<String> list) {

		list.stream().map(str -> str + " length is: " + str.length()).forEach(System.out::println);

	}

	private static void cubesOfOddNumbers(List<Integer> list) {
		list.stream().filter(number -> number % 2 != 0).map(c -> c * c * c).forEach(System.out::println);

	}

	private static void squaresOfEvenNumbers(List<Integer> list) {
		list.stream().filter(number -> number % 2 == 0).map(c -> c * c)

				.forEach(System.out::println);
	}

}
