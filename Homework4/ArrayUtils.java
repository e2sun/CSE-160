//Evelyn Sun
//115417946


public class ArrayUtils {
	public static int[] randomArray(int size, int upper) {
		int x[] = new int[size];
		for (int i=0;i<size;i++) {
			x[i]= (int)(Math.random()*upper);
		}
		return x;
	}
	public static void print(int[]y) {
		for (int element:y) {
			System.out.print(element + " ");
		}
	}
	public static double arraySum(int []y) {
		double sum =0; 
		for (int i=0; i<y.length;i++) {
			sum+=y[i];
		}
		return sum;
	}
	public static int contains(int[]y, int z) {
		for (int i=0; i<y.length;i++) {
			if (y[i]==z) {
				return i;
			}
			
		}
		return -1;
	}
	public static int countMultiplesOf(int[]y, int z) {
		int count=0;
		for (int i=1; i<y.length;i++) {
			if (multipleOf(y[i],z)) {
				count++;
			}
			if (y[i]==0) {
				count++;
			}
			
		}
		return count;
		
	}
	public static boolean multipleOf(int y, int z) {
		if (y%z==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = randomArray(100,21);
		double average = arraySum(x)/x.length;
		//print(x);
		System.out.println();
		System.out.println("The average of all the numbers is " +  average);
		int index = contains(x,12);
		System.out.println("The first index of 12 is " + index);
		int multiples = countMultiplesOf(x,7);
		System.out.println("7 is a multple of " + multiples + " numbers in this array");
		
		
		

	
		//System.out.println(multipleOf(2,2));
		
		//print(x);
		//System.out.println(countMultiplesOf(x,2));
		//System.out.println(contains(x,5));
	
		

	}
	

}
