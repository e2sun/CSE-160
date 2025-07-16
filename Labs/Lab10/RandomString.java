//Evelyn Sun
//115417946

import java.util.Scanner;
public class RandomString {
	public static String randomString(int len, char ulcase) {
		char[] upperletters = new char[26];
		int i=0;
		while (i<26) {
			for (int j=65;j<91;j++) {
				upperletters[i] = (char)j;
				i++;
			}
		}
		
		char[] lowerletters = new char[26];
		int y = 0;
		while (y<26) {
			for (int z=97;z<123;z++) {
				lowerletters[y] = (char)z;
				y++;
			}
		}
		String result = "";
		
		if (ulcase=='u') {
			
			//int x = Math.random(upperletters.length-1);
			for (int t = 0; t<len; t++) {
				int x= (int)(Math.random()*upperletters.length-1);// need to fix random
				result+=upperletters[x];
			}
		}
		else if (ulcase=='l'){
			for (int t=0;t<len;t++) {
				int x=(int)(Math.random()*lowerletters.length-1);
				result+=lowerletters[x];
			}
			
		}
		
		return result;
		 
	}

	public static void main(String[] args) {
		Scanner Kb = new Scanner (System.in);
		Scanner Kc = new Scanner(System.in);
		System.out.print("Enter a length and u or l for the case: ");
		int len = Kb.nextInt();
		char ulCase = Kb.next().charAt(0);
		
		System.out.print("The random string is: ");
		System.out.println(randomString(len,ulCase));
	}
		
	}
		