package Aug14;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,5,6,6,8};
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
