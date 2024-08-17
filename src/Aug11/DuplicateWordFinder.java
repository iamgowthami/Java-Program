package Aug11;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		String input="Tata Swift nexon Tata Swift";
		String[] word=input.split(" ");
		Set<String> uniqword=new HashSet<String>();
		for(String words:word) {
			uniqword.add(words.trim());
		}
		for(String words:uniqword) {
			System.out.println(words);
		}
	}

}
