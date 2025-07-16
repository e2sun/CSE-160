//Evelyn Sun
//115417946

import java.util.Scanner;


public class PopulationEstimates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = Kb.nextInt();
		int lastTwo = year%100;
		int approx = 3*(lastTwo  - 10) + 310;
		System.out.println("Population estimate (millions of people): "+ approx);

	}

}
