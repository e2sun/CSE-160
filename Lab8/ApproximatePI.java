//Evelyn Sun
//115417946

import java.util.Scanner;

public class ApproximatePI {
	public static double approximateOfPi(int num) {
		double count=0;
		for (double i = 1;i<=num;i++) {
			count +=(Math.pow(-1, i+1))/(2*i-1);
		}
		double PI = 4*count;
		return PI;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10000;
		while (i<=100000) {
			double a = approximateOfPi(i);
			System.out.println("i = " + i + " PI approximate: " + a);
			i=i+10000;
		
		}

	}

}
