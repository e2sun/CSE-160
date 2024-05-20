//Evelyn Sun
//115417946
import java.util.Arrays;
import java.util.Scanner;
public class RandomMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]checkers=new int[8][8];
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				int c = (int)(Math.random()*2);
				checkers[i][j]=c;
				System.out.print(checkers[i][j]);
				
				
				
			}
			System.out.println();
		}
		
		int total;
		for (int r=0;r<8;r++) {
			total=0;
			for (int c=0;c<8;c++) {
				total+=checkers[r][c];
			}
			
			if (total==0) {
				System.out.println("Row " + r + " is all 0's");
			}
			else if (total==8) {
				System.out.println("Row " + r + " is all 1's");
			}
		}
		
		for (int c=0;c<8;c++) {
			total=0;
			for (int []row:checkers) {
				total+=row[c];
			}
			
			if (total==0) {
				System.out.println("Column " + c + " is all 0's");
			}
			else if (total==8) {
				System.out.println("Row " + c + " is all 1's");
			}
		}
		
		total=0;
		for (int i=0;i<8;i++) {
			total+=checkers[i][i];
		}
			
		if (total==0) {
			System.out.println("The major diagonal is all 0's");
		}
		else if (total==8) {
				System.out.println("The major diagonal is all 1's");
		}
		
		total=0;
		for (int j=0;j<8;j++) {
			total+=checkers[j][7-j];
		}
			
		if (total==0) {
			System.out.println("The minor diagonal is all 0's");
		}
		else if (total==8) {
				System.out.println("The minor diagonal is all 1's");
		}
		
		
		
	}
		

}


