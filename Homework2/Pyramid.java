//Evelyn Sun
//115417946


import java.util.Scanner;
import java.io.*;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lines = Kb.nextInt();
		
		for (int i = 0; i<lines;i++) {
                for (int spaces = lines - i; spaces != 0; --spaces) {
                    System.out.print("\t");
                }
				for (int k = 0; k<i;k++) {
					//System.out.print("\t");
					System.out.print((int)(Math.pow(2, k)) + "\t");
					//System.out.print("\t");
				}
				for (int j = i; j>=0; j--) {
					System.out.print((int)(Math.pow(2, j))+ " \t");
				}
				System.out.println();
			}
		}
}
		

			
			
			
	
		
	


