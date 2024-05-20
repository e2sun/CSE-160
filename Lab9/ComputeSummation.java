//Evelyn Sun
//115417946
import java.util.Scanner;

public class ComputeSummation {
	public static double Summation(double j) {
		double m =0;
		for (double i=1; i<=j;i++) {
			m+=(i/(i+1));
			
		}
		return m;
	}

	public static void main(String[] args) {
		//System.out.println(Summation(2));
		// TODO Auto-generated method stub
		System.out.printf("%s\t%s", "i", "m(i)");
		System.out.println();
		int j=1;
		while (j<=20) {
			System.out.printf("%d\t%.4f",j,Summation(j));
			System.out.println();
			j++;
		}

	}

}
