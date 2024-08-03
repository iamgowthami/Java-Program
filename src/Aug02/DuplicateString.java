package Aug02;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String input="masum";
		Set<Character> unique=new HashSet<Character>();
		Set<Character> duplicate=new HashSet<Character>();
		for(char c:input.toCharArray()) {
			if(!unique.add(c));
			duplicate.add(c);
			
		}
		System.out.println(duplicate);

		

	}

}
