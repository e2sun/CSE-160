import java.util.Scanner;

public class BinaryToDecimal {
	public static int bin2Dec(String binaryString) {
		int b = Integer.valueOf(binaryString);
		int dec=0;
		int i=0;
		while (b!=0) {
			int m = b%10;
			dec+=(m*Math.pow(2,i));
			i++;
			b=b/10;
			
		}
		return dec;
	}

	public static void main (String args[]) {
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter binary: ");
		String binary = Kb.nextLine();
		System.out.println(bin2Dec(binary));	
		
	}

}
