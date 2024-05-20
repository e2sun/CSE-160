//Evelyn Sun
//115417946

import java.util.Scanner; 
import java.util.Arrays;

public class GPA {
	public static double gpaCalculator(String[]grades) {
		double gpa=0;
		//int count=0;
		for (int i=0;i<grades.length;i++) {
			if (grades[i].equals("A")) {
				gpa+=4.0;
				//count++;
			}
			else if (grades[i].equals("A-")) {
				gpa+=3.67;
			}
			else if (grades[i].equals("B+")) {
				gpa+=3.33;
			}
			else if (grades[i].equals("B")) {
				gpa+=3.0;
			}
			else if (grades[i].equals("B-")) {
				gpa+=2.67;
			}
			else if (grades[i].equals("C+")) {
				gpa+=2.33;
			}
			else if (grades[i].equals("C")) {
				gpa+=2.0;
			}
			else if (grades[i].equals("C-")) {
				gpa+=1.67;
			}
			else if (grades[i].equals("D+")) {
				gpa+=1.33;
			}
			else if (grades[i].equals("D")) {
				gpa+=1.0;
			}
			else if (grades[i].equals("F")) {
				gpa+=0.0;
			}
			else {
				return -1;
			}
			
			
		}
		gpa = gpa/grades.length;
		return gpa;
		 
	}

	public static void main(String[] args) {
		System.out.println(gpaCalculator(new String[] {"A", "F", "C", "B"}));
		System.out.println(gpaCalculator(new String[] {"A-", "B-", "C-", "F"}));
		System.out.println(gpaCalculator(new String[] {"F", "C+", "D+","A+"}));
	
		// TODO Auto-generated method stub
		
		
		//System.out.println(gpaCalculator(x));
		
	

	}

}
