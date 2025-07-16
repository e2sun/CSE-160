//Evelyn Sun
//115417946

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = Kb.nextLine();
		int vowels = 0;
		int consonants = 0;
		int spaces=0;
		
		for (int i = 0; i<s.length();i++){
			char ch = s.charAt(i);
			if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
				vowels++;	
			}
			else if (ch==' ') {
				spaces++;
			}
			else {
				consonants++;
			}
			
		}
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
	

	}
}


