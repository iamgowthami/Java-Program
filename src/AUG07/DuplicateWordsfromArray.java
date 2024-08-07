package AUG07;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsfromArray {

	public static void main(String[] args) {
		String input= "tata,nexon,tata,nexon,swift";
		String[] word=input.split(",");
		Set<String> unique=new HashSet<String>();
		for(String words:word) {
			unique.add(words.trim()); 
			
				
			}
		for(String words:unique) {
			System.out.println("print unique words:"+words);
			
		}

		

	}

}
