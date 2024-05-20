//Evelyn Sun
//115417946

import java.util.Arrays;
import java.util.Scanner;

public class SortRows {
	public static void bubbleSort(double[]list) {
		boolean changed=true;
		do {
			changed=false;
			for (int j=0;j<list.length-1;j++) {
				if (list[j]>list[j+1]) {
					double temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					changed=true;
				}
				
			}
			
		} while (changed);
		
	}
	
	public static double[][]sortRows(double[][]m){
		double[][]sort=new double[3][3];
		for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					bubbleSort(m[i]);
				}
				
				
			}
		return m;
			
		}

		
		
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		double[][]trial=new double[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				trial[i][j]=Kb.nextDouble();
			}
		}
		System.out.println("The row-sorted array is:");
		sortRows(trial);
		for (int m=0;m<3;m++) {
			for (int n=0;n<3;n++) {
				System.out.print(trial[m][n]+" ");
			}
			System.out.println();
		
			
		}

	}
}
	


