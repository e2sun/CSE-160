//Evelyn Sun
//115417946

import java.util.Scanner;
import java.util.*;


public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String first = Kb.nextLine();
		System.out.print("Enter the second string: ");
		String second = Kb.nextLine();
		String prefix = "";
		
		if (first.length()>=second.length()) {
			for (int i= 0; i<second.length()-1; i++) {
				if (second.substring(i,i+1).equals(first.substring(i,i+1))){
					prefix = prefix + second.substring(i,i+1);
				}
			}
		}
			
		else {
			for (int i= 0; i<first.length()-1; i++) {
				if (first.substring(i,i+1).equals(second.substring(i,i+1))){
					prefix = prefix + first.substring(i,i+1);
				}
			}
		}
		
			
		
		if (prefix.equals("")) {
			System.out.println(first + " and " + second + " have no common prefix.");
		}
		else {
			System.out.println("The common prefix is: " + prefix) ;
		}

	}

}
