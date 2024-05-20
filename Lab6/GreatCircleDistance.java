//Evelyn Sun
//115417946
import java.util.Scanner;
import java.util.*;


public class GreatCircleDistance {
	public static void main(String args[]) {
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = Kb.nextDouble();
		double y1 = Kb.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = Kb.nextDouble();
		double y2 = Kb.nextDouble();
		
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		
		double radius = 6371.01;
		double distance = radius * Math.acos((Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
		
		System.out.println("The distance between the two points is " + distance  + " km"); 
	}
	
}
