//Evelyn Sun
//115417946

import java.util.Scanner;

public class Geometry {
	public static double getTriangleArea(double[][]points) {
		double area=0;
		double x1 = points[0][0];
		double y1 = points[0][1];
		double x2 = points[1][0];
		double y2 = points[1][1];
		double x3 = points[2][0];
		double y3 = points[2][1];
		
		double a = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		double b = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1, 2));
		double c = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2, 2));
		double s = (a+b+c)/2;
		
		double answer = s*(s-a)*(s-b)*(s-c);
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		if (answer<0) {
			return 0;
			
		} else {
			return area;
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		double [][]points = new double[3][2];
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				points[i][j]=Kb.nextDouble();
			}
		}
		
		if (getTriangleArea(points)==0) {
			System.out.println("The three points are on the same line.");
			
		}
		else {
			System.out.print("The area of the triangle is ");
			System.out.printf("%.2f",getTriangleArea(points));

		}
	}

}
