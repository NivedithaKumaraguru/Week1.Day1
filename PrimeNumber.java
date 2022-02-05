package week1.day1;

public class PrimeNumber {
	public static void main(String[]args) {
		
	int input  = 13;
	
	boolean flag = false;
	
	for(int i= 2;i<=input/2;i++) {
		
		int r = input%i;
		
		if (r == 0) 
		{
			flag = false;
			break;
		}
	}

	if(flag) {
		System.out.println(input + "is a not a prime number");
	}
	else {
		System.out.println(input + "is a prime number");
	}
}
}
