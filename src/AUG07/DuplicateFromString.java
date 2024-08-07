package AUG07;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFromString {

	public static void main(String[] args) {
		String name="gowthamireddygowtha";
		Set<Character> unique=new HashSet<Character>();
		Set<Character> duplicate=new HashSet<Character>();
		for(char c:name.toCharArray()) {
			if(!unique.add(c)) {
				duplicate.add(c);
			}
		}
		System.out.println(duplicate);

	}

}
