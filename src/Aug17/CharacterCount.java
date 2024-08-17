package Aug17;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String input="gowthamigow";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c:input.toCharArray()) {
			map.put(c, map.getOrDefault(c,0) +1);
		}
		System.out.println(map);

	}

}
