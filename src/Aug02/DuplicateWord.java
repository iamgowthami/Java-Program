package Aug02;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String carnames="tata,nexon,nexon,rangerover,tata";
		String[] word=carnames.split(",");
		Set<String> uniq = new HashSet<String>();
		for(String words:word) {
			uniq.add(words.trim());
		}
		for(String words:uniq) {
			System.out.println("unique words are:"+words);
		}

	}

}
