//Evelyn Sun
//115417946

import java.util.Arrays;

public class BinarySearchRecursive {
	public static int binarySearch(int[]arr,int target) {
		if (arr.length==0) {
			return -1;
		}
		return binarySearch(arr,target,0,arr.length-1) ;
			
	}
	public static int binarySearch(int[]arr, int target, int low, int high) {
		if (low>high||low==high&&target != arr[low]) {
			return -1;
		}
		int mid = ((high-low)/2)+low;
		if (target==arr[mid]) {
			return mid;
		}
		else if (target>arr[mid]) {
			return binarySearch(arr, target, mid+1, high);
		}
		else {
			return binarySearch(arr,target,low,mid-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[10];
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*20+1);
		}
		Arrays.sort(arr);
		int target = (int)(Math.random()*20+1);
		System.out.println("arr: " +  Arrays.toString(arr));
		System.out.println("target: " + target);
		System.out.println("location: " +binarySearch(arr,target));
		 

	}

}
