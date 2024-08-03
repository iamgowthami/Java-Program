package Aug03;

public class LeapAndNonLeapYear {

	public static void main(String[] args) {
		int arr[]= {2012,2023,2030,2045,2080};
		for(int year:arr) {
			if((year%4==0)&&(year%100!=0)||(year%400==0)) {
				System.out.println("leap year:"+year);
			}else {
				System.out.println("non leap year:"+year);
			}
		}

	}

}
