//Evelyn Sun
//115417946
import java.util.Scanner;


public class IsLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner (System.in);
		System.out.print("Enter in a year: ");
		int year = Kb.nextInt();
		boolean isLeapYear = false;;
		
		if (year%400==0) {
			isLeapYear = true;
		}
		else if (year%100==0) {
			isLeapYear = false;
		}
		else if (year%4==0) {
			isLeapYear = true;
		}
		
		if (isLeapYear) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
		
		

	}
	

}
