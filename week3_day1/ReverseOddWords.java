package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";

		//Split the words and have it in an array
		String[] split = test.split(" ");

		//Traverse through each word using loop
		for (int i = 0; i < split.length; i++) {
			//- Find the odd index within the loop
			if (i % 2 != 0) {
				//- Convert the String array into a character array
				char[] arr = split[i].toCharArray();

				//- Print the even position words using another loop            
				for(int j=arr.length-1;j>=0;j--)
				{
					System.out.print(arr[j]);
				}
			}
			else
			{
				System.out.print(split[i]);
		}
		System.out.print(" ");
	}
}
}
