//Evelyn Sun
//115417946


import java.util.*;

public class ReverseDisplay {
	public static void reverseDisplay(int n) {
		String result = Integer.toString(n);
		String alter = "";
		for (int i=result.length()-1;i>=0;i--) {
			alter+=result.charAt(i);
			//System.out.print(result.charAt(i));
		}
		n=Integer.parseInt(alter);
		System.out.print(n);
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

