package activities;

import java.util.Arrays;

public class Activity4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray = {3,2,7,12,32,6,5,44,98};
		System.out.println("Original Array: "+Arrays.toString(unsortedArray));
		System.out.println("Sorted Array: "+Arrays.toString(insertionSort(unsortedArray)));
	}
	
	static int[] insertionSort(int[] array) {
    	for(int it=1;it<array.length; it++) {
    		int key = array[it];
    		int prev = it-1;
    		while(prev>=0 && key<array[prev]) {
    			array[prev+1] = array[prev];
    			prev--;
    		}
    		array[prev+1]=key;
    	}
		return array;
	}
}
