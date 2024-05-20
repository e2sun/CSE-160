//Evelyn Sun
//115417946

import java.util.Scanner;
public class Palindrome {
	public static String isPalindrome(String input) {
		String input1 = input.replace(" ", "");
		if (input1.length()%2==0) {
			String s="";
			String t="";
			for (int i=0; i<input1.length()/2;i++) {
				s=s+input1.charAt(i);
			}
			for (int j=input1.length()-1;j>=input1.length()/2;j--) {
				t = t + input1.charAt(j);
			}
			if (s.equalsIgnoreCase(t)) {
				String r = "Input String " + input + " is a palindrome";
				return r;
			}
			else {
				String r = "Input String " + input + " is NOT a palindrome";
				return r;
			}
		}
		else {
			String s = "";
			String t = "";
			for (int i=0; i<input1.length()/2;i++) {
				s = s+input1.charAt(i);
			}
			for (int j = input1.length()-1;j>input1.length()/2;j--) {
				t = t+input1.charAt(j);
			}
			if (s.equalsIgnoreCase(t)) {
				String r = "Input string " + input + " is a palindrome";
				return r;
			}
			else {
				String r = "Input string " + input + " is NOT a palindrome";
				return r;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String input = Kb.nextLine();
		System.out.println(isPalindrome(input));

	}

}
