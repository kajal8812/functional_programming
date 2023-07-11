package programming;

import java.util.List;

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordSpring(List.of("spring", "spring boot", "api", "pcf"));
	}

	private static void wordSpring(List<String> list) {
		list.stream().filter(i -> i.contains("spring")).forEach(System.out::println);
	}

}
