//Evelyn Sun
//115417946

import java.util.Scanner;

public class ReverseDisplay {
	public static void reverseDisplay(int n) {
		if (n<10) {
			System.out.print(n);
		}
		else {
			System.out.print(n%10);
			reverseDisplay(n/10);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Input an int: ");
		int k = Kb.nextInt();
		System.out.print(k + " reversed is ");
		reverseDisplay(k);

	}

}
