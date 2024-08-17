package Aug16;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,5,6,6,7,8,9};
		Set<Integer> uniquenum= new HashSet<Integer>();
		Set<Integer> duplicatenum= new HashSet<Integer>();
		for(int num:arr) {
			if(!uniquenum.add(num)) {
				duplicatenum.add(num);
			}
		}
		System.out.println(duplicatenum);


	}

}
