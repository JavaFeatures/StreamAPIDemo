package demo;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(8, 44, 29, 18, 13, 28, 64, 51, 87, 92);
		numbers.stream().filter(num -> num % 2 == 0);
//		List<Integer> evenNumbersList = new ArrayList<Integer>();
//		for (int num:numbers) {
//			if (num % 2 == 0) {
//				evenNumbersList.add(num);
//			}
//		}
	}

}
