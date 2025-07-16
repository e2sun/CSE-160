//Evelyn Sun
//115417946

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter a number of amount of integers: ");
		int n = Kb.nextInt();
		System.out.print("Enter the integers: ");
		int positive = 0;
		int negative = 0;
		int total = 0;
		int average = 0;
		for (int i = 0; i<n; i++) {
			int c = Kb.nextInt();
			if (c>0) {
				positive++;
				total= total+c;
			}
			else if (c<0) {
				negative++;
				total=total+c;
			}
		 
		}
		average = total/n;
		System.out.println("Amount of Positive Integers: " + positive);
		System.out.println("Amount of Negative Integers: " + negative);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		

	}

}
