package demo;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Monday", "Friday", "March", "September", "Sunday", "August");
		boolean dayOfWeekPresent = input.stream().anyMatch(str -> str.endsWith("day"));
		System.out.println("Day of week present = " + dayOfWeekPresent);
	}

}
