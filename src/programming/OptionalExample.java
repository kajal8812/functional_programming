package programming;

import java.util.List;
import java.util.Optional;
//import java.util.*;
import java.util.function.Predicate;

public class OptionalExample {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "apple", "Bnanan", "orange");

		Predicate<? super String> Predicate = str -> str.startsWith("B");

		//Optional<String> o = list.stream().filter(Predicate).findFirst().orElse(null);

		Optional<String> o1 = list.stream().filter(Predicate).findFirst();

		//String  o2 = list.stream().filter(Predicate).findFirst().get();

		//	String o3 = list.stream().filter(Predicate).findFirst().orElse(null);

		//orelse () will return string type and without orelse () it returns optional type
		System.out.println(o1.get());
		System.out.println(o1.isPresent());
	}
}
