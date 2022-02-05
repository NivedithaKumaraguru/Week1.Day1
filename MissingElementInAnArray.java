package week1.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[]args) {
		
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		for(int iterator=1; iterator<=arr.length;iterator++) {
			
			if(iterator!= arr[iterator-1]) {
				System.out.println("The missing number in the given array is "+iterator);
				break;
			}
		}
	}
}
