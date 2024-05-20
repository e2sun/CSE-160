//Evelyn Sun
//115417946 

import java.util.Scanner;

public class Anagram {
	public static String isAnagram(String one, String two) {
		String rone = one.replace(" ", "");
		rone = rone.toLowerCase();
		String rtwo = two.replace(" ", "");
		rtwo = rtwo.toLowerCase();
		
		if (rone.length()!=rtwo.length()) {
			String r = one + " " + two + " are NOT anagrams";
			return r;
		}
		int count1=0;
		int count2=0; 
		
		for (int i=0; i<rone.length();i++) {
			if (rtwo.contains(rone.substring(i,i+1))) {
				count1++;
			}
		}
		for (int j=0;j<rtwo.length();j++) {
			if (rone.contains(rtwo.substring(j,j+1))) {
				count2++;
			}
		}
		if (count1==count2) {
			String r = one + " and " + two + " are anagrams";
			return r;
		}
		else {
			String r = one + " and " + two + " are NOT anagrams";
			return r;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String first = Kb.nextLine();
		System.out.print("Enter the second string: ");
		String second = Kb.nextLine();
		System.out.println(isAnagram(first,second));
		

	}

}
