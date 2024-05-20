//Evelyn Sun
//115417946
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner (System.in);
		System.out.print("Side 1: ");
		double s1 = Kb.nextDouble();
		System.out.print("Side 2: ");
		double s2 = Kb.nextDouble();
		System.out.print("Side 3: ");
		double s3 = Kb.nextDouble();
		
		String output = "";
		
		if ((s1+s2>s3)&&(s2+s3>s1)&&(s1+s3>s2)) {
			if ((s1==s2)&&(s2==s3)&&(s1==s3)) {
				output = " Equilateral";
			}
			else if ((s1==s2)||(s2==s3)||(s1==s3)) {
				output = " Isosceles";
			}
			else {
				output = " Scalene";
			}
		}
		else {
			output = " Invalid input!";
		}
		
		System.out.println("Output:" + output);
		

	}

}
