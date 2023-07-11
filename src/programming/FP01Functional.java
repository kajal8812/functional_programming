package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		//printAllNumbers(List.of(3, 5, 6, 6, 7, 2, 4, 6));
		evenNumber(List.of(3, 5, 6, 6, 7, 2, 4, 6));

	}

	//	private static void print(int i) {
	//		if (i % 2 == 0)
	//			System.out.println(i);
	//	}

	private static void printAllNumbers(List<Integer> numbers) {

		//	way 1:numbers.stream()
		//.forEach(FP01Functional::print);      ->method reference

		//stream() is used to convert list of numbers into sequence of numbers and take each element
		//take each element and for each elemnt call print method with that element

		//way 2:we can even simple the code(line 18) using method referenece
		numbers.stream().forEach(System.out::println);
		//take each elemnt and do system.out.println for each elemnt

	}

	//	private static boolean isEven(int i) {
	//		return i % 2 == 0;
	//	}

	private static void evenNumber(List<Integer> n) {
		//we want to filter elemnts before printing
		n.stream()
				//.filter(FP01Functional::isEven)
				.filter(number -> number % 2 == 0) //lambda expression
				.forEach(System.out::println);
	}

}
