package demo;

import java.util.ArrayList;
import java.util.List;

public class StreamChainingDemo {

	public static void main(String[] args) {
		List<Cartoon> cartoonCharacters = new ArrayList<Cartoon>();
		cartoonCharacters.add(new Cartoon("Mickey", "Mouse"));
		cartoonCharacters.add(new Cartoon("Donald", "Duck"));
		cartoonCharacters.add(new Cartoon("Peppa", "Pig"));
		cartoonCharacters.add(new Cartoon("Daffy", "Duck"));
		cartoonCharacters.add(new Cartoon("Scooby", "Doo"));
		cartoonCharacters.add(new Cartoon("Bugs", "Bunny"));
		cartoonCharacters.stream().
		filter(cartoon -> cartoon.getLastName().startsWith("D")).
		map(cartoon -> cartoon.getFirstName() + " " + cartoon.getLastName()).
		sorted().
		forEach(str -> System.out.println("Name of cartoon character is " + str));
	}

}
