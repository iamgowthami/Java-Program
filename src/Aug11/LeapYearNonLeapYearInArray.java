package Aug11;

public class LeapYearNonLeapYearInArray {

	public static void main(String[] args) {
		int arr[]= {2045,2012,1046,1998,2030};
		for(int year:arr) {
			if((year%4==0)&&(year%100!=0)||(year%400==0)) {
				System.out.println("leaf year:"+year);
			}else {
				System.out.println(" Non leaf year:"+year);

			}
		}

	}

}
