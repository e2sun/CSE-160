
//Evelyn Sun
//115417946

import java.util.Scanner;

public class ShowMeTheMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb =  new Scanner (System.in);
		System.out.print("Enter the number of farthings: ");
		int farthings = Kb.nextInt();
		int sterlings = farthings/960;
		farthings = farthings%960;
		int shilling = farthings/48;
		farthings = farthings%48;
		int pennies = farthings/4;
		farthings = farthings%4;
		System.out.println("Pound Sterling " + sterlings);
		System.out.println("Shilling " + shilling);
		System.out.println("Penny " + pennies);
		System.out.println("Farthings " + farthings);
		
		

	}

}
