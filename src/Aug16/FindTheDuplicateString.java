package Aug16;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateString {

	public static void main(String[] args) {
		String name="gowthamireddy";
		Set<Character> uniqCharacters=new HashSet<Character>();
		Set<Character> duplicateCharacters=new HashSet<Character>();
		for(char c:name.toCharArray()) {
			if(!uniqCharacters.add(c)) {
				 duplicateCharacters.add(c);
			}
		}
		System.out.println(duplicateCharacters);


	}

}
