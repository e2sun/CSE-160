//Evelyn Sun
//115417946

import java.util.Scanner;

public class PentagonalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = Kb.nextInt();
		int pn = n*(3*n-1)/2;
		System.out.println("Pentagonal number: " + pn);
		

	}

}
