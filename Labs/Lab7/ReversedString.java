//Evelyn Sun
//115417946

import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = Kb.nextLine();
		String reverse = "";
		for (int i = word.length()-1; i>=0;i--){
			reverse += word.charAt(i);
			}
		System.out.println("Reversed String: " + reverse);
	
		
				

	}

}
