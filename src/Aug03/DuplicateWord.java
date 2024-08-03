package Aug03;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String name = "tata,tata,nexon";
		String[] word = name.split(",");
		Set<String> unique = new HashSet<>();
		for (String words : word) {
			unique.add(words.trim());

		}
		for (String words : unique) {
			System.out.println(words);
		}

	}

}
