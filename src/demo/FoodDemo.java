package demo;

import java.util.ArrayList;
import java.util.List;

public class FoodDemo {

	public static void main(String[] args) {
		List<Food> list = new ArrayList<Food>();
		list.add(new Food("Apple", 50));
		list.add(new Food("Burger", 300));
		list.add(new Food("Salad", 120));
		list.add(new Food("Cucumber", 15));
		list.add(new Food("Sandwich", 250));
		list.stream().
		filter(food -> food.getCalories() < 100).
		map(food -> food.getName()).
		sorted().
		forEach(str -> System.out.println("Name of food is " + str));
	}

}
