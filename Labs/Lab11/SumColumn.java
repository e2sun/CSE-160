//Evelyn Sun
//115417946

import java.util.Scanner;
import java.util.Arrays;
public class SumColumn {
	public static double sumColumn(double[][]m, int c) {
		double n=0;
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				if (j==c) {
					n+=m[i][j];
				}
			}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the dimensions of an n x m matrix: ");
		int n=Kb.nextInt();
		int m=Kb.nextInt();
		System.out.println("Enter the matrix of " + n +" x " + m+ ": ");
	
		double [][]h=new double[n][m];
		for (int k=0;k<n;k++) {
			for (int l=0;l<m;l++) {
				h[k][l]=Kb.nextInt();
			}
			
		}
		
		System.out.println("The sums of the columns are: ");
		for (int p=0;p<m;p++) {
			int s= (int) sumColumn(h,p);
			System.out.print(s + " ");
		}
		

	}

}
