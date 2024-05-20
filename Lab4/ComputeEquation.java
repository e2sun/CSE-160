//Evelyn Sun
//115417946


import java.util.Scanner;
public class ComputeEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		double x = Kb.nextDouble();
		System.out.print("Enter the second value: ");
		double y = Kb.nextDouble();
		double eqvalue = x/(y-(3*x))+(x-1)/(y/(x+1));
		System.out.println("Equation value: "+ eqvalue);
		
		

	}

}
