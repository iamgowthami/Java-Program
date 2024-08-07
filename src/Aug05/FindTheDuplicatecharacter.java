package Aug05;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicatecharacter {

	public static void main(String[] args) {
		String input="GowthamiReddy Suresh";
		Set<Character> duplicate=new HashSet<Character>();
		Set<Character> unique=new HashSet<Character>();
		for(char c:input.toCharArray()) {
			if(!unique.add(c)) {
				duplicate.add(c);
			}
		}
		System.out.println(duplicate);

		

	}

}
