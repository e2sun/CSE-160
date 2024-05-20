//Evelyn Sun
//115417946
import java.util.Scanner;

public class AreaOfTriangle {

	public static double areaOfTriangle(double base, double height) {
		double area = 0.5*(base)*(height);
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the values of base and height: ");
		double base = Kb.nextDouble();
		double height = Kb.nextDouble();
		System.out.println("Area of this triangle with base " + base + " and height " + height + " is: " + areaOfTriangle(base,height));

	}

}
