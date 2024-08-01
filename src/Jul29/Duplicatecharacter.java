package Jul29;

import java.util.HashSet;
import java.util.Set;

public class Duplicatecharacter {

	public static void main(String[] args) {
		String input= "india delhi".toLowerCase();
		
		Set<String> duplicate= new HashSet<String>();
		Set<String> unique= new HashSet<String>();
		for(char c:input.toCharArray()) {
			if(!unique.add(input)) {
				duplicate.add(input);
			}
		}
	}

}
