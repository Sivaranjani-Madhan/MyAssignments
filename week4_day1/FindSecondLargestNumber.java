package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//- Declare an array {3, 2, 11, 4, 6, 7}
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(11);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		//- Arrange the collection in ascending order
		Collections.sort(numbers);
		//- Pick the 2nd element from the last and print it
		
		//by index
		//int secondLarge=numbers.get(4);
		//by size()-2
		int secondLarge=numbers.get(numbers.size()-2);
		System.out.println("second largest number is "+secondLarge);


	}

}
