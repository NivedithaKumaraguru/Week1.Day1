package week1.day1;

import java.util.Arrays;

public class Anagram { 
	
	public static void main(String[] args) {
		String text1 ="stops";
		String text2 ="potss";
		
		if(text1.length() == text2.length()) {
			
			char[] arrtext1 = text1.toCharArray();
			char[] arrtext2 = text2.toCharArray();
			
			Arrays.sort(arrtext1);
			Arrays.sort(arrtext2);
			boolean status = Arrays.equals(arrtext1, arrtext2);
			if(status){
				System.out.println(text1 + "and" + text2 + "are anagrams");
			}
			else {
				System.out.println(text1 + "and" + text2 + "are not anagrams");
			}
		}
	}
}

