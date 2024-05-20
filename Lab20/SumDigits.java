//Evelyn Sun
//115417946

import java.util.*;

public class SumDigits {
	public static long sumDigits(long n) {
		String k = Long.toString(n);
		long sum=0;
		for (int i=0;i<k.length();i++) {
			sum+=(k.charAt(i)-'0');
			//System.out.println(sum);
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb= new Scanner(System.in);
		System.out.print("Enter a long: ");
		long k = Kb.nextLong();
		
		
		
		System.out.println("The sum of the digits is " + sumDigits(k));

	}

}
