//Evelyn Sun
//115417946



import java.lang.reflect.Array;
import java.util.Arrays;

public class InterleaveArrays {
	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int[]x = new int[array1.length+array2.length];
		int count=0;
		int i;
		
		
		for (i=0; i<array1.length&&i<array2.length;i++) {
			x[count++]=array1[i];
			x[count++]=array2[i];
		}
		for (;i<array1.length;i++) {
			x[count++]=array1[i];
		}
	 
		
		for (;i<array2.length;i++) {
			x[count++]=array2[i];
		}
		
		return x;
	}
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int [] array1 = interleaveArrays(new int[]{1,3,5}, new int[] {2,4,6});
		int [] array2 = interleaveArrays(new int[] {10,20,30,40,50,60,70,80}, new int[] {2,4,6,8});
		int [] array3 = interleaveArrays(new int[] {1,3,5}, new int[] {2,4,6,8});
		
		System.out.print(Arrays.toString(array1) + "\n");	
		System.out.print(Arrays.toString(array2) + "\n");
		System.out.print(Arrays.toString(array3) + "\n");
	}

}
