package week3.day1;

import java.util.Arrays;

public class CheckAnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1="stop";
		String text2="post";
		
		//Convert both the strings to character arrays
		if(text1.length()==text2.length()) {
			
			//Convert both the strings to character arrays
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			//Sort both the character arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//Check if the sorted arrays are equal
			if(Arrays.equals(charArray1, charArray2))
				System.out.println("The given strings are Anagram.");
			else
				System.out.println("The given strings are not an Anagram");
			
		} else
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");     
	}

}
