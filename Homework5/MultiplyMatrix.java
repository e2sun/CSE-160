//Evelyn Sun
//115417946

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyMatrix {
	public static double[][] multiplyMatrix(double[][]a, double[][]b){
		//double [][]result=new double[a.length][b.length[0]];
		double[][]result= new double[3][3];
		double[]arr= new double[9];
		double sum=0;
		
		
		int c=0;
		while (c<3) {
			for (int d=0;d<3;d++) {
				for (int e=0;e<3;e++) {
					sum+=a[c][e]*b[e][d];
				
				}
			
				result[c][d]=sum;
				sum=0;
				
			}
			c++;
			
			

		
	
		
		
		}
		
	
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.println("Enter matrix1:");
		double[][]trial=new double[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				trial[i][j]=Kb.nextDouble();
			}
		}
		System.out.println("Enter matrix2:");
		double[][]trial2=new double[3][3];
		for (int m=0;m<3;m++) {
			for (int n=0;n<3;n++) {
				trial2[m][n]=Kb.nextDouble();
			}
		}
		
		System.out.println("Multiplication of the matrices is:");
		double [][]result=multiplyMatrix(trial, trial2);
		
		for (int y=0;y<3;y++) {
			for (int z=0;z<3;z++) { 
				System.out.printf("%.1f", result[y][z]);
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
