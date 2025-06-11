
package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,4,3,2,8,6,7};
		int lengthofArray=a.length;
		Arrays.sort(a);
		for(int i=a[0];i<lengthofArray-1;i++)
		{
			if(a[i+1]!=a[i]+1) // a[i] + 1 next consecutive element , a[i+1] next element in the array 
				System.out.println("Missing Element is " + (a[i]+1));
		}
		
	}

}
