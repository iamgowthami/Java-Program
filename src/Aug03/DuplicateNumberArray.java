package Aug03;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberArray {

	public static void main(String[] args) {
		int arr[]= {22,33,44,55,5,22,8,33};
		Set<Integer> unique=new HashSet<Integer>();
		Set<Integer> duplicate=new HashSet<Integer>();
		for(int num:arr) {
			if(!unique.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);

	}

}
