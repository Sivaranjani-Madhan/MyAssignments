package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String companyName= "TestLeaf";
		 
		 //Convert the given String to a character array
		 char[] charArray = companyName.toCharArray();
		 
		 //- Implement a loop to iterate through each character of the String (from end to start).
		for(int i=charArray.length-1;i>=0;i--)
		{
			//- Print the characters to display the reversed String.
			System.out.print(charArray[i]);
		}
	}

}
