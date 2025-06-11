package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="changeme";
		
		//Convert the given String to a character array
		char[] charArray = test.toCharArray();
		
		//Implement a loop to iterate through each character of the String (from end to start).
		
		for(int i=0;i<charArray.length;i++)
		{
			//Find the odd index within the loop
			if(i%2!=0)
				charArray[i] = Character.toUpperCase(charArray[i]);			
		}
		
		System.out.println(charArray);
		
	}
}