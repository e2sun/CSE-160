
import java.util.Scanner;

public class ReverseString {
	public static void reverseDisplay(String str) {
		reverseDisplay(str,str.length()-1);
	}
	public static void reverseDisplay(String str, int high) {
		if (high >= 0) {
		System.out.print(str.charAt(high));
		reverseDisplay(str, high - 1);
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		reverseDisplay(s);

	}

}
