package programming;

import java.util.List;

public class Excersie4 {

	public static void main(String[] args) {
		count(List.of("spring", "spring boot", "api", "pcf"));
	}

	private static void count(List<String> list) {
		list.stream().filter(str -> str.length() <= 4).forEach(System.out::println);
	}

}
