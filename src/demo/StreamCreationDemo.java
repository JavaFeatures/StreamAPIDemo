package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(8, 44, 29, 18, 13, 28, 64, 51, 87, 92);
		Stream<Integer> numberStream = numbers.stream();
		int[] myArray = new int[] {4, 12, 15, 21};
		IntStream arrayStream = Arrays.stream(myArray);
		Stream<String> days = Stream.of("Monday", "Tuesday", "Wednesday");
		Stream<Integer> randomNumbersStream = Stream.generate(() -> new Random().nextInt(100));
		Stream<String> animals = Stream.of("Cat", "Mouse", "Dog");
		animals.forEach(str -> System.out.println(str));
	}

}
