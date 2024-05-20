//Evelyn Sun
//115417946

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		Scanner Kc = new Scanner(System.in);
				
		String [][]arr=new String[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				arr[i][j]="-";
			}
		}
		
		String status="";
		int count=0;
		
		boolean unfinished =true;
		boolean player_one = true;
		
		while(count<9) {
		
			if (player_one) {
				System.out.print("Player one: ");
				int row1 = Kb.nextInt()-1;
				int col1 = Kb.nextInt()-1; 
				arr[row1][col1]="X";
				//player_one=false;
			
			}
			if (player_one==false) {
				System.out.print("Player two: ");
				int row2 = Kb.nextInt()-1;
				int col2 = Kb.nextInt()-1;
				arr[row2][col2]="O";
				//player_one=true;
			}


			if ((arr[0][0].equals("X")&& arr[0][1].equals("X") && arr[0][2].equals("X"))||(arr[1][0].equals("X")&&
					arr[1][1].equals("X")&& arr[1][2].equals("X"))||(arr[2][0].equals("X")&& arr[2][1].equals("X") && arr[2][2].equals("X"))||
					(arr[0][0].equals("X")&& arr[1][0].equals("X") && arr[2][0].equals("X"))||(arr[0][1].equals("X")&&
							arr[1][1].equals("X")&& arr[2][1].equals("X"))||(arr[0][2].equals("X")&&(arr[1][2]).equals("X")&& arr[2][2].equals("X"))||
									(arr[0][0].equals("X")&&arr[1][1].equals("X")&&arr[2][2].equals("X"))||
									(arr[0][2].equals("X")&& arr[1][1].equals("X") && arr[2][0].equals("X"))){
				status="Player 1 wins";
				System.out.println(status);
				System.out.println();
				for (int k=0;k<arr.length;k++) {
					for (int l=0;l<arr[k].length;l++) {
						System.out.print(arr[k][l]+" ");
					}
					System.out.println();
				}
				break;
			}
				
				
			else if ((arr[0][0].equals("O")&& arr[0][1].equals("O") && arr[0][2].equals("O"))||(arr[1][0].equals("O")&&
					arr[1][1].equals("O")&& arr[1][2].equals("O"))||(arr[2][0].equals("O")&& arr[2][1].equals("O") && arr[2][2].equals("O"))||
					(arr[0][0].equals("O")&& arr[1][0].equals("O") && arr[2][0].equals("O"))||(arr[0][1].equals("O")&&
							arr[1][1].equals("O")&& arr[2][1].equals("O"))||(arr[0][2].equals("O")&&(arr[1][2]).equals("O")&& arr[2][2].equals("O"))||
									(arr[0][0].equals("O")&&arr[1][1].equals("O")&&arr[2][2].equals("O"))||
									(arr[0][2].equals("O")&& arr[1][1].equals("O") && arr[2][0].equals("O"))){
				status="Player 2 wins";
				System.out.println(status);
				System.out.println();
				for (int k=0;k<arr.length;k++) {
					for (int l=0;l<arr[k].length;l++) {
						System.out.print(arr[k][l]+" ");
					}
					System.out.println();
				}
				break;
			}
		
			
			
			player_one=!player_one;
			count++;
			if (count==9) {
				status="draw";
				System.out.println(status);
				System.out.println();
				for (int k=0;k<arr.length;k++) {
					for (int l=0;l<arr[k].length;l++) {
						System.out.print(arr[k][l]+" ");
					}
					System.out.println();
				}
			}
			else {
				status="unfinished";
				System.out.println(status);
				System.out.println();
				for (int k=0;k<arr.length;k++) {
					for (int l=0;l<arr[k].length;l++) {
						System.out.print(arr[k][l]+" ");
					}
					System.out.println();
				}
			}
			System.out.println();
		
		
		}
		
		
		
	}
		
	
		
		
		
		
		
		

}
	


