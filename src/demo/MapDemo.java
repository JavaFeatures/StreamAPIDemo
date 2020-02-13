package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Jane", "George", "Dan");
		Stream<String> inputWithHello = input.stream().map(str -> "Hello " + str);
		inputWithHello.forEach(str -> System.out.println(str));
	}

}
