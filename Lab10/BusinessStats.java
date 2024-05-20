//Evelyn Sun
//115417946
import java.util.Scanner;

public class BusinessStats {
	public static double mean(double[]x) {
		int length = x.length;
		double total=0;
		for (int i=0;i<length;i++) {
			total+=x[i];
		}
		double mean= total/length;
		return mean;
	}
	public static double deviation(double[]x) {
		double square = 0;
		double mean=0;
		for (int i=0;i<x.length;i++) {
			square+=Math.pow(x[i],2);
			mean+=x[i];
		}
		double meansqr = Math.pow(mean,2);
		double std = (square - ((meansqr)/x.length))/(x.length-1);
		
		return Math.sqrt(std);
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		
		double[]x = new double[10];
		System.out.print("Enter 10 numbers: ");
		for (int i=0; i<10;i++) {
			x[i]= Kb.nextDouble();
		}

		
		System.out.printf("The mean is %.2f ", mean(x));
		System.out.println();
		System.out.printf("The standard deviation is %.5f", deviation(x));
		

	}

}
