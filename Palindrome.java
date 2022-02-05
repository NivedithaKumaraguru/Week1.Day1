package week1.day1;

public class Palindrome {
	public static void main(String[]args) {
		
	String name = "madam";
	String rev = "";
	
	char[] nameArr = name.toCharArray();
	
	for(int i= nameArr.length-1; i>=0; i--) {
		
		rev=rev + nameArr[i];
		System.out.println(rev);
	}
	if(name.equals(rev)) {
		System.out.println("String" + name + "is a Palindrome");
	}else {
		System.out.println("String" + name + "is not a Palindrome");
	}
}

}
