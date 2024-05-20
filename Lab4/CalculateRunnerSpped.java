//Evelyn Sun
//115417946
import java.util.Scanner;


public class CalculateRunnerSpped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Input the distance in miles: ");
		double miles = Kb.nextDouble();
		System.out.print("Input the time in minutes: ");
		double minutes = Kb.nextDouble();
		double hours = minutes/60;
		double speed = miles/hours;
		System.out.println("Speed: " + speed);

	}

}
