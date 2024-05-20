//Evelyn Sun
//115417946

import java.util.Scanner;

public class Emirp {
	public static boolean non_palindrome(int n) {
		String input1 = ""+n;
		if (input1.length()%2==0) {
			String s="";
			String t="";
			for (int i=0; i<input1.length()/2;i++) {
				s=s+input1.charAt(i);
			}
			for (int j=input1.length()-1;j>=input1.length()/2;j--) {
				t = t + input1.charAt(j);
			}
			if (s.equals(t)) {
				return false;
			}
			else {
				return true;
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
			if (s.equals(t)) {
				return false;
			}
			else {
				return true;
			}
		}
		
	}
	
	public static boolean isPrime (int n) {
		int count=0;
		for (int i=1;i<n;i++) {
			if (n%i==0) {
				count++;
			}
		}
		if (count>1) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static int getPalindrome(int n) {
		String reverse = "";
		String nn = "" + n;
	
		for (int i = nn.length()-1; i>=0;i--){
			reverse += nn.charAt(i);
			}
		int hi = Integer.valueOf(reverse);
		return hi;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String output = "";
		int i=0;
		int j=0;
		while (i<=100) {
			if (non_palindrome(j)&&(isPrime(j))&&(isPrime(getPalindrome(j)))){
				System.out.print(j + " ");
				i++;
			}
			j++;
		}
		//System.out.print(output);
		

				
		

	}

}
