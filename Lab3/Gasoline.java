//Evelyn Sun
//115417946

import java.util.Scanner;

public class Gasoline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		double minutes = Kb.nextDouble();
		System.out.print("Enter the constant speed of the car (m/h): ");
		double cs = Kb.nextDouble();
		System.out.print("Enter the fuel efficiency of the car (m/g): ");
		double fe = Kb.nextDouble();
		double gc = minutes/60 * cs * 1/fe;
		System.out.println("Consumed gas for the period (in gallons): " + gc);
		
		
		

	}

}
