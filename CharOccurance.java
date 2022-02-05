package week1.day1;

public class CharOccurance {
	
	public static void main(String[]args) {
		
		String str = "welcome to chennai";
		
		int numberofOccurance =0;
		
		char charToBeChecked = 'e';
		
		char[] arrstr = str.toCharArray();
		
		for(int i=0; i<=arrstr.length-1; i++) {
			
			if(arrstr[i]== charToBeChecked) {
				numberofOccurance++;
			}
		}
		System.out.println(numberofOccurance + "time character" + charToBeChecked + "occurs in the String:" + str);
		
	}

}
