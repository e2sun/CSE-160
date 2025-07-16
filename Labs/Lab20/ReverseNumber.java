//Evelyn Sun
//115417946

import java.util.*;

public class ReverseNumber {
	public static int reverseNumber(int n) {
		String result = Integer.toString(n);
		String alter = "";
		for (int i=result.length()-1;i>=0;i--) {
			alter+=result.charAt(i);
			//System.out.print(result.charAt(i));
		}
		n=Integer.parseInt(alter);
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int k = Kb.nextInt();
		System.out.println(k + " reversed is " + reverseNumber(k));
		

	}

}
