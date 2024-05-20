//Evelyn Sun
//115417946
import java.util.Scanner;

public class CharacterCount {
	public  static int count(String str, char a) {
		int count=0;
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i)==a) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		//Scanner Kc = new Scanner(System.in);
		System.out.print("Enter a string followed by a character: ");
		String str = Kb.next();
		char a = Kb.next().charAt(0);
		int o = count(str, a);
		System.out.println("The number of occurences of " + a + " in " + str + " is " + o);
	}

}
