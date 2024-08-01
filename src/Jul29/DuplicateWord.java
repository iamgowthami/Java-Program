package Jul29;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String input = "Tata,swift,audi,Tata";
		String[] word=input.split(",");
		Set<String> unique=new HashSet<String>();
		for(String words:word) {
			unique.add(words.trim());
				
			}
		for(String words:unique) {
			System.out.println("unique words:"+words);
		}
	
	}

}
