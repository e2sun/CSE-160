//Evelyn Sun
//115417946

import java.util.Scanner;
import java.util.*;

public class RegularPolygon {

	public static void main(String[] args) {
		Scanner Kb  = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int sides = Kb.nextInt();
		System.out.print("Enter the side length: ");
		double sl = Kb.nextDouble();
		double area = (sides*(Math.pow(sl,2)))/(4*Math.tan(Math.PI/sides));
		
		System.out.println("The area of the polygon is " + area);

	}

}
