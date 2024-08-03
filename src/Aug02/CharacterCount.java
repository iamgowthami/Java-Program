package Aug02;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		String sc="gowthamigowthamisuresh";
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		for(char c:sc.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		System.out.println(map);

	}

}
