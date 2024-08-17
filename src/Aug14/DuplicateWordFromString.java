package Aug14;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFromString {

	public static void main(String[] args) {
		String name="tata,tata,nexon,swift,gowthami";
		String[] word=name.split(",");
		Set<String> uniqueword=new HashSet<String>();
		for(String words:word) {
			uniqueword.add(words.trim());
		}
		for(String words:uniqueword) {
			System.out.println(words);
		}
	}

}
