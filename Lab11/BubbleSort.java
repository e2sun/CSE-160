//Evelyn Sun
//115417946

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the length of your array: ");
		int l=Kb.nextInt();
		System.out.print("Enter values for your array: ");
		double[]m=new double[l];
		for (int i=0;i<m.length;i++) {
			m[i]=Kb.nextDouble();
			
		}
		bubbleSort(m);
		for (int k=0;k<m.length;k++) {
			System.out.print(m[k]+" ");
		}
		

	}

}

