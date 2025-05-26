package week1.day2;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=101;
		int rem;
		int output = 0;
		//reverse using for loop
		for(int i=input;i>0;i=i/10)
		{
           // System.out.println(i+ "i");
			rem=i%10; //to get last digit
			//System.out.println(rem+ "rem");
			output = output * 10 + rem; //// Append digit to output
			//System.out.println(output+ "output");
			
		}
		if(input==output)
		{
			System.out.println(input + " is palindrome number");
		}
		else
		{
			System.out.println(input + " is not palindrome number");	
		}


	}
}


