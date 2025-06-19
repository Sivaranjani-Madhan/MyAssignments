package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//- Declare an array for {3, 2, 11, 4, 6, 7}
		List<Integer> listA=new ArrayList<Integer>();
		//Add array elements to a list
		listA.add(3);
		listA.add(2);
		listA.add(11);
		listA.add(4);
		listA.add(6);
		listA.add(7);
		//Declare another array for {1, 2, 8, 4, 9, 7}
		List<Integer> listB=new ArrayList<Integer>();
		//Add array elements to a list
		listB.add(1);
		listB.add(2);
		listB.add(8);
		listB.add(4);
		listB.add(9);
		listB.add(7);
		//- Iterate the values through the length of the list
		for(int i=0;i<listA.size();i++)
		{
			for(int j=0;j<listB.size();j++)
			{
				//Compare both the arrays
				if(listA.get(i).equals(listB.get(j)))
				{
					System.out.println(listA.get(i));
				}
			}
		}
		
	}

}
