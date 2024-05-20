//Evelyn Sun
//115417946
import java.util.Scanner;

public class GasRefillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the distance: ");
		double distance = Kb.nextDouble();
		System.out.print("Enter the mpg: ");
		double mpg = Kb.nextDouble();
		System.out.print("Enter the price: ");
		double price = Kb.nextDouble();
		
		double pftt = distance/mpg * price;
		System.out.println("Price for the trip: " + pftt);

	}

}
