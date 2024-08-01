package Jul29;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		int arr[]= {12,34,55,66,77,89,12,34};
		Set<Integer> duplicate= new HashSet<Integer>();
		Set<Integer> unique = new HashSet<Integer>();
		for(int num:arr) {
			if(unique.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println("duplicate number:"+duplicate);

	}

}
