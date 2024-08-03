package Aug02;

public class LeapYearandNonLeapYearInarray {

	public static void main(String[] args) {
		int arr[]= {2012,20218,2025,2028,2080};
		for(int year:arr) {
			if((year%4==0)&&(year%100!=0)||(year%100==0)) {
				System.out.println("leaf year:"+year);
			}else {
				System.out.println("non leaf year:"+year);
			}
		}

	}

}
