//Evelyn Sun
//115417946

import java.util.Scanner;

public class SumDigits {
	public static int sumDigits(int n) {
		if (n < 10) {
			return n;
		}
		return n % 10 + sumDigits(n / 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb= new Scanner(System.in);
		System.out.print("Enter an int: ");
		int k = Kb.nextInt();
		
		System.out.println("The sum of the digits is " + sumDigits(k));

	}

}
