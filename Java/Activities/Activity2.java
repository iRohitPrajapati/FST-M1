package activities;

import java.util.Arrays;

public class Activity2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 77, 10, 54, -11, 10};
		System.out.println("Input Array: "+ Arrays.toString(arr));
		// search term & sum variables
		int search=10;
		int sum=30;
		// Call method
		System.out.println("Output is " + checkSum(arr, search, sum));
	}
	
	public static boolean checkSum(int[] array, int search, int expectedSum) {
		// Initialize an iterator variable
		int sum = 0;
		for(int item:array) {
			if(item==search)
				sum+=search;
			
			if(sum>expectedSum)
				break;
		}
		return sum == expectedSum;
	}
}
