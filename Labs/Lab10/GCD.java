//Evelyn Sun
//115417946

import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int first = Kb.nextInt();
		System.out.print("Enter the second integer: ");
		int second = Kb.nextInt();
		
		int gcf=0;
		
		if (first>=second) {
			int i=1;
			while (i<second) {
				if (first%i==0&&second%i==0) {
					gcf=i;
				}
				i++;
			}
		}
		else {
			int j=1;
			while (j<first) {
				if (first%j==0&&second%j==0) {
					gcf=j;
				}
				j++;
				
			}
		}
		
		System.out.print("The greatest common divisor is: " + gcf);

	}

}
