package Aug16;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String input="Gowthami,reddy,Gowthami,suresh";
		String[] word=input.split(",");
		Set<String> uniqueword=new HashSet<String>();
		for(String words:word) {
			uniqueword.add(words.trim());
		}
		for(String words:uniqueword) {
			System.out.println(words);
			
		}
		

	}

}
