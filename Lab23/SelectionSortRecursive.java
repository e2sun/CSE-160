//Evelyn Sun
//115417946
import java.util.Arrays;

public class SelectionSortRecursive {
	
	public static void sort(int[] list) {
		sort(list,0,list.length-1);
	}
	public static void sort(int[] list, int low, int high) {
		if (low<high) {
			int indexOfMin = low;
			indexOfMin = findMin(list,low+1,high,indexOfMin);
			int temp=list[low];
			list[low] = list[indexOfMin];
			list[indexOfMin]=temp;
			sort(list,low+1,high);
		}
	}
	public static int findMin(int[]list, int i, int high, int indexOfMin) {
		if (list[i]<list[indexOfMin]) {
			indexOfMin=i;
		}
		if (i>=high) {
			return indexOfMin;
		}
		return findMin(list,i+1,high,indexOfMin);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = new int[10];
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*50+1);
		}
		System.out.println("arr: " + Arrays.toString(arr));
		sort(arr);
		System.out.println("sorted: " + Arrays.toString(arr));

	}

}
