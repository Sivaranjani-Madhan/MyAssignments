package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		List<String> values=new ArrayList<String>();
		
		//Add the collection to a list 
		values.add("HCL");
		values.add("Wipro");
		values.add("Aspire Systems");
		values.add("CTS");
		
		//Arrange the collection in ascending order
		Collections.sort(values);
		
		//1st way
		/*
		 * Use reverse loop to iterate the collection for(int
		 * i=values.size()-1;i>=0;i--) { System.out.println(values.get(i)); }
		 */
		
		//2nd way
		// Reverse the list
        Collections.reverse(values);

        // Iterate the collection
        for (String value : values) {
            System.out.println(value);
        }

	}

}
