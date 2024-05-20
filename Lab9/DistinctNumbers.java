//Evelyn Sun
//115417946
import java.util.Arrays;

import java.util.Scanner;

public class DistinctNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		String n = Kb.nextLine();
		n = n.replace(" ", "");
		String result="";
		
		for (int j=0;j<n.length();j++) {
				//char b = n.charAt(j);
			if (!(result.contains(n.substring(j,j+1)))) {
				result+=n.charAt(j);
			}
				
		}
			
		int []x = new int[result.length()];
		for  (int i=0;i<result.length();i++) {
			int p = Integer.parseInt(result.substring(i,i+1));
			x[i] = p;
		}
		
		
		System.out.print("Unique Numbers: ");
		for (int j=0;j<x.length;j++) {
			System.out.print(x[j] + " ");
		}
		
	
		
		//i++;	
		//}
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		