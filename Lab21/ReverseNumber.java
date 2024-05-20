//Evelyn Sun
//115417946

import java.util.Scanner;

public class ReverseNumber {
	public static int reverseNumber (String i) {
		if (i.length()==1) {
			return Integer.parseInt(i);	
		}
		else {
			return Integer.parseInt(i.substring(i.length()-1)+reverseNumber(i.substring(0,i.length()-1)));
		}
	}
		
		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter an number: ");
		String k = Kb.nextLine();
		System.out.println(k + " reversed is " + reverseNumber(k));

	}

}
