package week3.day1;

public class RemoveDupicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn Java basics as part of java sessions in java week1";

		//- Initialize a variable ‘count’ to keep track of the number of duplicate words found

		int count=0;

		//Split the text into an array of words using space as the delimiter

		String[] split = text.split(" ");

		//- Create two nested for loops to compare each word with every other word in the String array

		for(int i=0;i<split.length;i++)
		{
			for(int j=i+1;j<split.length;j++)
			{
				//If a duplicate word is found, it is replaced with an empty string and the count is incremented
				if(split[i].equalsIgnoreCase(split[j]))
				{
					split[j]=" ";
					count++;				
				}
			}
		}
		
		for(int i=0;i<split.length;i++)
		{
			System.out.print(split[i]+ " ");
		}
	}



}



