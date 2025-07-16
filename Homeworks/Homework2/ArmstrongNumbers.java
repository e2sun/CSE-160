//Evelyn Sun
//115417946

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		
		System.out.print("Enter the lower limit: ");
		int lower = Kb.nextInt();
		System.out.print("Enter the upper limit: ");
		int upper = Kb.nextInt();
		
		System.out.print("The Armstrong numbers between " + lower + " and " + upper + " are: ");
		
		
		for (int i = lower; i<upper; i++) {
			int sum = 0;
			int tempi = i;
			int digits = String.valueOf(i).length();
			
			while(tempi!=0) {
				int k = tempi%10;
				sum  += (int)Math.pow(k, digits);
				tempi = tempi/10;
			}
			if (sum==i) {
				System.out.print(i + " ");
			}
			
	
		}

	}

}
