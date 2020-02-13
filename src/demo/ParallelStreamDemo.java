package demo;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<String> animals = Arrays.asList("Monkey", "Lion", "Mouse", "Tiger", "Zebra", "Mongoose");
		System.out.println("Using a normal stream:");
		animals.stream().filter(str -> str.startsWith("M")).sorted().forEach(str -> System.out.println("Animal is " + str));
		System.out.println("Using a parallel stream:");
		animals.parallelStream().filter(str -> str.startsWith("M")).sorted().forEach(str -> System.out.println("Animal is " + str));
	}

}
