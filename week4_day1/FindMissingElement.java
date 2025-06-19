package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare an array {1, 2, 3, 4, 10, 6, 8}
		List<Integer> numbers=new ArrayList<Integer>();
		
		//add the numbers
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(10);
		numbers.add(6);
		numbers.add(8);
		
		//Arrange the collection in ascending order
		Collections.sort(numbers);
		/*
		 * //Inside the loop, check the current element + 1 is not equal to the next
		 * element. This comparison checks if there is a gap in the sequence of numbers
		 */
		
		for(int i=0;i<numbers.size()-1;i++)
		{
			//Do a comparison check if there is a gap in the sequence of numbers
			if(numbers.get(i+1) != numbers.get(i)+1)
			{
				//Use the get() method to get an element from the list
				System.out.println("Missing number " + (numbers.get(i)+1));
			}
		}
		
	}

}
