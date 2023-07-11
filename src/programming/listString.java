package programming;

import java.util.List;

public class listString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printString(List.of("learn mvc", "learn spring", "spring boot"));
	}

	private static void printString(List<String> list) {
		list.stream().forEach(System.out::println);
	}

}
