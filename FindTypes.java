package week1.day1;

public class FindTypes {

	public static void main(String[]args) {
		String test = "$$ Welcome to 2nd Class of Automation $$";
		
		int letter= 0, space= 0, num= 0, specialChar = 0;
		char[]arrTest = test.toCharArray();
		
		for(int i=0; i<=arrTest.length-1; i++) {
			char temp = arrTest[i];
			if(Character.isLetter(temp)) {
				letter++;
			}
			else if(Character.isSpaceChar(temp)) {
				space++;
			}
			else if(Character.isDigit(temp)) {
				num++;
			}
			else {
				specialChar++;
			}
		}
		System.out.println("letter:" + letter);
		System.out.println("space:" + space);
		System.out.println("number:" + num);
		System.out.println("specialCharacter:" + specialChar);
	}
}
