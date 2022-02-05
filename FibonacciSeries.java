package week1.day1;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		int range = 8;
		int firstNumber = 0;
		int secNumber = 1;
		
		int sum = firstNumber;
		
		System.out.println("firstNumber");
		System.out.println("secNumber");
		
		
 for(int i=1; i<=range-1; i++) {
	 
	 sum= firstNumber + secNumber;
	 firstNumber = secNumber;
	 secNumber = sum;
	 System.out.println(sum);
		

	}

}

}
