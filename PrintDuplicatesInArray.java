package week1.day1;

public class PrintDuplicatesInArray {
	public static void main(String[]args) {
		
		int[]arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int arrLength = arr.length;

		int count ;

		for(int i=0; i <= arrLength-1;i++) {
			
			count = 0;

			for(int i2=i+1;i2 <=arrLength-1;i2++) {

				if(arr[i] == arr[i2]) {
				
					count++;
				}				
			}
			
			if(count > 0) {
				System.out.println("The variable " + arr[i] + "is duplicated");
			}

		}

	}

}