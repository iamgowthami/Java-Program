package Aug02;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		int arr[]= {22,5,5,4,3,2,222,2,22};
		Set<Integer> unique= new HashSet<Integer>();
		Set<Integer> duplicate= new HashSet<Integer>();
		for(int ar:arr) {
			if(!unique.add(ar));
			duplicate.add(ar);
		}
		System.out.println(duplicate);

		

	}

}
