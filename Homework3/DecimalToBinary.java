//Evelyn Sun
//115417946

import java.util.Scanner;

public class DecimalToBinary {
	public static String dec2Bin(int value) {
		String n = "";
		while (value!=0){
			n+=(value%2);
			value=value/2;
		}
		String reverse = "";
		for (int i = n.length()-1; i>=0;i--){
			reverse += n.charAt(i);
		}
		String r = "(" + reverse + ")_2";
		//System.out.println(r);
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter decimal: ");
		int decimal = Kb.nextInt();
		System.out.println(dec2Bin(decimal));

	}

}
