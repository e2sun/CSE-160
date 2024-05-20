//Evelyn Sun
//115417946


public class LargestInArray {
	private static int largest;
	public static int findLargest(int[]list, int currentIndex) {
		if (currentIndex==0) {
			largest = list[currentIndex];
		}
		if (currentIndex==list.length) {
			return largest;
		}
		else {
			largest=max(largest,list[currentIndex]);
			return findLargest(list,currentIndex+1);
		}
			
	}
	public static int max(int a, int b){
	 if (a > b) { return a; }
	 else { return b; }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []test= {2,3,6,1,6,7,25,10,2};
		System.out.println("Largest value of test is: " + findLargest(test,0));

	}

}
